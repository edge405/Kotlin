package Day2.Problem1

fun main() {
    val database = MovieDatabase()

    database.addMovie("Inception", "Christopher Nolan", 2010, "Sci-Fi")
    database.addMovie("The Dark Knight", "Christopher Nolan", 2008, "Action")
    database.addMovie("The Shawshank Redemption", "Frank Darabont", 1994, "Drama")

    println(database.listMovies())
    // Output: [Movie(title=Inception, director=Christopher Nolan, releaseYear=2010, genre=Sci-Fi),
    //           Movie(title=The Dark Knight, director=Christopher Nolan, releaseYear=2008, genre=Action),
    //           Movie(title=The Shawshank Redemption, director=Frank Darabont, releaseYear=1994, genre=Drama)]

    val searchedMovies = database.searchByTitle("Inception")
    println(searchedMovies)
    // Output: [Movie(title=Inception, director=Christopher Nolan, releaseYear=2010, genre=Sci-Fi)]

    val actionMovies = database.filterByGenre("Action")
    println(actionMovies)
    // Output: [Movie(title=The Dark Knight, director=Christopher Nolan, releaseYear=2008, genre=Action)]
}