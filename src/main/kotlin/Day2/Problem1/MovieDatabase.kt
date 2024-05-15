package Day2.Problem1

class MovieDatabase {
    val movies = mutableListOf<Movie>()

    fun addMovie(title: String, director: String, releaseYear: Int, genre: String){
        movies.add(Movie(title, director, releaseYear, genre))
    }
    fun searchByTitle(title: String): List<Movie>{
        return movies.filter { it.title == title }
    }
    fun listMovies(): List<Movie>{
        return movies
    }
    fun filterByGenre(genre: String): List<Movie>{
        return movies.filter { it.genre == genre }
    }
}