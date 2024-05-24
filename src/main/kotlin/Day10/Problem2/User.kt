package Day10.Problem2

data class User(
    val userId: String,
    val name: String,
    val borrowedBooks: MutableList<Book> = mutableListOf()
)
