package Day9.Problem2

fun main() {
    // Create a movie database
    val movieDatabase = MovieDatabase()

    // Step 1: Add Movies
    movieDatabase.addMovie(Movie(1, "The Shawshank Redemption", "Drama", 1994))
    movieDatabase.addMovie(Movie(2, "The Godfather", "Crime", 1972))
    movieDatabase.addMovie(Movie(3, "The Dark Knight", "Action", 2008))

    // Step 2: Add Users
    movieDatabase.addUser(User(1, "Alice"))
    movieDatabase.addUser(User(2, "Bob"))
    movieDatabase.addUser(User(3, "Charlie"))

    // Step 3: Add Ratings
    movieDatabase.addRating(Rating(1, 1, 5))  // Alice rates "The Shawshank Redemption" 5 stars
    movieDatabase.addRating(Rating(1, 2, 4))  // Alice rates "The Godfather" 4 stars
    movieDatabase.addRating(Rating(2, 1, 4))  // Bob rates "The Shawshank Redemption" 4 stars
    movieDatabase.addRating(Rating(2, 3, 5))  // Bob rates "The Dark Knight" 5 stars
    movieDatabase.addRating(Rating(3, 2, 5))  // Charlie rates "The Godfather" 5 stars

    // Create a recommendation system
    val recommendationSystem = RecommendationSystem(movieDatabase)

    // Step 4: Get Recommendations
    val recommendationsForBob = recommendationSystem.getRecommendations(2)

    // Step 5: Print Recommendations
    println("Recommendations for Bob:")
    for (movie in recommendationsForBob) {
        println("${movie.title} (${movie.releaseYear}) - ${movie.genre}")
    }
}