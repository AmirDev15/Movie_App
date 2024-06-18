package com.example.movie_app.navigation


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape

import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.movie_app.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun BannerScreen(navController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        // Background Image
        Image(
            painter = painterResource(id = R.drawable.bg_image), // Ensure the image is correctly placed and named
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        // Overlay for login form
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0x88000000)) // Semi-transparent overlay to darken the background
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Spacer(modifier = Modifier.height(60.dp))

                // Logo Image (optional, can remove if not needed)


                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = "LOGIN PAGE",
                    color = Color.White,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.height(24.dp))

                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    label = { Text("Email", color = Color.White) },
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.Transparent, RoundedCornerShape(8.dp)),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        unfocusedBorderColor = Color.Gray,
                        focusedBorderColor = Color.White,

                        cursorColor = Color.White
                    )
                )

                Spacer(modifier = Modifier.height(16.dp))

                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    label = { Text("Password", color = Color.White) },
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.Transparent, RoundedCornerShape(8.dp)),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        unfocusedBorderColor = Color.Gray,
                        focusedBorderColor = Color.White,

                        cursorColor = Color.White
                    )
                )

                Spacer(modifier = Modifier.height(24.dp))

                Button(
                    onClick = {
                        navController.navigate("HomeScreen")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp),
//                    colors = ButtonDefaults.buttonColors(
//
//                    ),
                    shape = RoundedCornerShape(25.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
//                            .background(
//                                brush = Brush.horizontalGradient(
//                                    colors = listOf(Color(0xFFFFA726), Color(0xFFFB8C00))
//                                ),
//                                shape = RoundedCornerShape(25.dp)
//                            ),
                                ,
                        contentAlignment = Alignment.Center
                    ) {
                        Text(text = "LOG IN", color = Color.White, fontSize = 16.sp)
                    }
                }

                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = "Dont have account?\nDont worry you can signup",
                    color = Color.White,
                    textAlign = TextAlign.Center
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = "SIGNUP",
                    color = Color(0xFFFFA726),
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}