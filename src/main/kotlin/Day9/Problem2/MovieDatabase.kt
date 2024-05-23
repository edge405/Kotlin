package Day9.Problem2

class MovieDatabase {
    private val movies = mutableListOf<Movie>()
    private val users = mutableListOf<User>()
    private val ratings = mutableListOf<Rating>()

    fun addMovie(movie: Movie) {
        movies.add(movie)
    }

    fun addUser(user: User) {
        users.add(user)
    }

    fun addRating(rating: Rating) {
        ratings.add(rating)
    }

    fun getMovies(): List<Movie> {
        return movies.toList()
    }

    fun getUsers(): List<User> {
        return users.toList()
    }

    fun getRatings(): List<Rating> {
        return ratings.toList()
    }
}