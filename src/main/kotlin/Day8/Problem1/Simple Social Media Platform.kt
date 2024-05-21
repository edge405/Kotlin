package Day8.Problem1

fun main() {
    val platform = SocialMediaPlatform()

    // Create user profiles
    val user1 = platform.createUser("johndoe", "John Doe", "Just another Kotlin enthusiast")
    val user2 = platform.createUser("janedoe", "Jane Doe", "Loving Kotlin!")

    // User1 follows User2
    platform.followUser(user1, user2)

    // User2 posts a message
    val post1 = platform.postMessage(user2, "Hello, world!")
    val post2 = platform.postMessage(user2, "Kotlin is awesome!")

    // User1 likes User2's posts
    platform.likePost(user1, post1)
    platform.likePost(user1, post2)

    // View User1's feed
    val feed = platform.viewFeed(user1)
    println("User1's Feed:")
    feed.forEach { post ->
        println("Post by ${post.author.Name} at ${post.timestamp}: ${post.content} (Likes: ${post.likes.size})")
    }

    // User1 unfollows User2
    platform.unfollowUser(user1, user2)

    // View User1's feed again
    val feedAfterUnfollow = platform.viewFeed(user1)
    println("User1's Feed After Unfollowing User2:")
    feedAfterUnfollow.forEach { post ->
        println("Post by ${post.author.Name} at ${post.timestamp}: ${post.content} (Likes: ${post.likes.size})")
    }
}