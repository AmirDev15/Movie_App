
A movie app that retrieves movie data from an API and displays it to users. The app consists of several pages including a startup page, login page, home page displaying all retrieved movies, and a detailed page for viewing movie details.

Packages
domain: Contains ApiInterface for API communication.
model: Includes data classes (Details, Metadata, MovieList) for handling movie data.
navigation: Holds components for the startup, login, home, and detail pages.
paging: Implements pagination interfaces and factories for loading next pages.
viewmodel: Manages data logic including the main repository and MovieViewModel.

Usage
Startup Page: Initializes the app and navigates to the login page.
Login Page: Allows users to authenticate and access the home page.
Home Page: Displays a list of movies retrieved from the API.
Detail Page: Shows detailed information when a movie is clicked.
Contributing
Contributions are welcome! If you'd like to contribute to this project, please fork the repository and submit a pull request with your changes.

