package Day9.Problem2

class RecommendationSystem(private val movieDatabase: MovieDatabase) {
    fun getRecommendations(userId: Int): List<Movie> {
        val userRatings = movieDatabase.getRatings().filter { it.userId == userId }
        val similarUsers = findSimilarUsers(userId)
        val recommendedMovies = mutableSetOf<Movie>()
        for (similarUser in similarUsers) {
            val userRatings = movieDatabase.getRatings().filter { it.userId == similarUser.id }
            recommendedMovies.addAll(getUnratedMovies(userRatings, userId))
        }
        return recommendedMovies.toList()
    }

    private fun findSimilarUsers(userId: Int): List<User> {
        val userRatings = movieDatabase.getRatings().filter { it.userId == userId }
        val similarUserIds = mutableSetOf<Int>()
        for (userRating in userRatings) {
            val ratingsByMovie = movieDatabase.getRatings().filter { it.movieId == userRating.movieId }
            val usersWithRating = ratingsByMovie.map { it.userId }.toSet()
            similarUserIds.addAll(usersWithRating)
        }
        similarUserIds.remove(userId) // Remove current user
        return movieDatabase.getUsers().filter { similarUserIds.contains(it.id) }
    }

    private fun getUnratedMovies(userRatings: List<Rating>, userId: Int): List<Movie> {
        val ratedMovieIds = userRatings.map { it.movieId }.toSet()
        return movieDatabase.getMovies().filterNot { ratedMovieIds.contains(it.id) }
    }
}
