package Day8.Problem1

import java.time.LocalDateTime

data class Post (
    val author: User,
    val content: String,
    val timestamp: LocalDateTime = LocalDateTime.now(),
    val likes: MutableList<User> = mutableListOf()
)
