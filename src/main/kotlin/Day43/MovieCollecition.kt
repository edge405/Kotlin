package Day43

class MovieCollection {
    private val movies: MutableList<Movie> = mutableListOf()

    fun addMovie(movie: Movie) {
        movies.add(movie)
    }

    fun listMovies() {
        for (movie in movies) {
            println(movie)
        }
    }

    fun searchByTitle(title: String) {
        val result = movies.filter { it.title.contains(title, ignoreCase = true) }
        if (result.isEmpty()) {
            println("No movies found with title containing \"$title\".")
        } else {
            for (movie in result) {
                println(movie)
            }
        }
    }
    fun searchByDirector(director: String) {
        val result = movies.filter { it.director.contains(director, ignoreCase = true) }
        if (result.isEmpty()) {
            println("No movies found directed by \"$director\".")
        } else {
            for (movie in result) {
                println(movie)
            }
        }
    }
}