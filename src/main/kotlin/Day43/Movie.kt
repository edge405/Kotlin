package Day43

data class Movie(
    val title: String,
    val director: String,
    val year: Int,
    val rating: Double
) {
    override fun toString(): String {
        return "$title ($year) - Director: $director, Rating: $rating"
    }
}

