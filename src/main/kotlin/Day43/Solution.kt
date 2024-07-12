package Day43

fun main() {
    val movieCollection = MovieCollection()

    val movie1 = Movie("Inception", "Christopher Nolan", 2010, 8.8)
    val movie2 = Movie("The Matrix", "Lana Wachowski, Lilly Wachowski", 1999, 8.7)
    val movie3 = Movie("Interstellar", "Christopher Nolan", 2014, 8.6)

    movieCollection.addMovie(movie1)
    movieCollection.addMovie(movie2)
    movieCollection.addMovie(movie3)

    println("All Movies:")
    movieCollection.listMovies()

    println("\nSearch by Title 'Inception':")
    movieCollection.searchByTitle("Inception")

    println("\nSearch by Director 'Christopher Nolan':")
    movieCollection.searchByDirector("Christopher Nolan")
}