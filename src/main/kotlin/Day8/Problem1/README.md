### Problem: Simple Social Media Platform

You are tasked with developing a simple social media platform where users can create profiles, follow each other, post messages, and like posts. The platform should provide basic functionalities for interaction and engagement among users.

#### Requirements:

1. **User Profile Creation**:
    - Users should be able to create a profile with the following attributes:
        - Username: String
        - Name: String
        - Bio: String (optional)
        - Followers: List of other Users (default is an empty list)
        - Following: List of other Users (default is an empty list)

2. **Follow/Unfollow Users**:
    - Users should be able to follow and unfollow other users.
    - Following a user should add the target user to the following list of the current user and add the current user to the followers list of the target user.
    - Unfollowing a user should remove the target user from the following list of the current user and remove the current user from the followers list of the target user.

3. **Posting Messages**:
    - Users should be able to post messages with the following attributes:
        - Content: String
        - Timestamp: DateTime
        - Likes: List of Users who liked the post (default is an empty list)

4. **Liking Posts**:
    - Users should be able to like and unlike posts.
    - Liking a post should add the current user to the likes list of the post.
    - Unliking a post should remove the current user from the likes list of the post.

5. **Viewing Feeds**:
    - Users should be able to view a feed of posts from users they follow.
    - The feed should display posts in reverse chronological order (newest first).

#### Example Usage:
```kotlin
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
        println("Post by ${post.author.name} at ${post.timestamp}: ${post.content} (Likes: ${post.likes.size})")
    }

    // User1 unfollows User2
    platform.unfollowUser(user1, user2)

    // View User1's feed again
    val feedAfterUnfollow = platform.viewFeed(user1)
    println("User1's Feed After Unfollowing User2:")
    feedAfterUnfollow.forEach { post ->
        println("Post by ${post.author.name} at ${post.timestamp}: ${post.content} (Likes: ${post.likes.size})")
    }
}
```

This problem challenges you to create a simple social media platform with user interactions, including following/unfollowing users, posting messages, liking/unliking posts, and viewing a feed. It allows you to practice object-oriented programming, handling relationships between objects, and implementing social media features in Kotlin.

#### :: What a problem 😌😌😌 Crazy!!
