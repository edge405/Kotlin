package Day8.Problem1

class SocialMediaPlatform {
    private val users = mutableListOf<User>()
    private val posts = mutableListOf<Post>()

    fun createUser(userName: String, name: String, bio: String?): User{
        val user = User(userName, name, bio)
        users.add(user)
        return user
    }
    fun followUser(follower: User, followee: User){
        if(!follower.followers.contains(followee)){
            follower.following.add(followee)
            follower.followers.add(follower)
        }
    }
    fun unfollowUser(follower: User, followee: User){
        if(follower.followers.contains(followee)){
            follower.following.remove(followee)
            follower.followers.remove(follower)
        }
    }
    fun postMessage(user: User, content: String): Post{
        val post = Post(user, content)
        posts.add(post)
        return post
    }
    fun likePost(user: User, post: Post){
        if(!post.likes.contains(user)){
            post.likes.add(user)
        }
    }
    fun unlikePost(user: User, post: Post){
        if(post.likes.contains(user)){
            post.likes.remove(user)
        }
    }
    fun viewFeed(user: User): List<Post>{
        return posts.filter { it.author in user.following }.sortedByDescending { it.timestamp }
    }
}