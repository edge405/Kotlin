package Day10.Problem2

data class Book(
    val isbn: String,
    val title: String,
    val author: String,
    var isAvailable: Boolean = true
)
