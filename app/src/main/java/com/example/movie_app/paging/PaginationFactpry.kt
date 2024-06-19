package com.mkrdeveloper.movieinfoappmvvm.paging

import retrofit2.Response
//the inline keyword is used for higher-order functions,
// which are functions that take other functions as parameters.
// By marking a function as inline, you tell the compiler to insert
// the function's body directly into each place where the function is called,
// rather than generating a call to the function
class PaginationFactory<Key, Item>(
    private  val initialPage: Key,//starting point of pagination
    private inline val onLoadUpdated:(Boolean)-> Unit,//callback updates loaded state
    private inline val onRequest:suspend (nextPage: Key)-> Response<Item>,//network or data request for next page of item.
    private inline val getNextKey:suspend (Item)-> Key,//get(extract) next page key from response
    private inline val onError:suspend (Throwable?)-> Unit,//handle errors
    private inline val onSuccess:suspend (items: Item, newPage: Key)-> Unit,//handle success

):Pagination<Key,Item> {
    private var currentKey = initialPage
    private var isMakingRequest = false

    override suspend fun loadNextPage() {
        if (isMakingRequest){
            return
        }
        isMakingRequest = true
        onLoadUpdated(true)
        try {
            val response = onRequest(currentKey)
            if (response.isSuccessful){
                isMakingRequest = false
                val items = response.body()!!
                currentKey = getNextKey(items)!!
                onSuccess(items, currentKey)
                onLoadUpdated(false)
            }
        }catch (e:Exception){
            onError(e)
            onLoadUpdated(false)
        }
    }

    override fun reset() {
       currentKey = initialPage
    }

}