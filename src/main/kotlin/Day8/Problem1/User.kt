package Day8.Problem1

data class User(
    val Username: String,
    val Name: String,
    val Bio: String?,
    val followers: MutableList<User> = mutableListOf(),
    val following: MutableList<User> = mutableListOf()
)
