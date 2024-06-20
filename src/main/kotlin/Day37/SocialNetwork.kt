package Day37

class SocialNetwork(private val users: List<User>) {

    fun recommendFriends(userId: Int): List<Int> {

        val user = users.find { it.id == userId } ?: return emptyList()

        val recommendations = mutableListOf<Pair<Int, Int>>()

        for (otherUser in users) {
            if (otherUser.id != user.id && otherUser.id !in user.friends) {
                val mutualFriends = user.friends.intersect(otherUser.friends).size
                if (mutualFriends > 0) {
                    recommendations.add(otherUser.id to mutualFriends)
                }
            }
        }


        return recommendations.sortedWith(compareByDescending<Pair<Int, Int>> { it.second }.thenBy { it.first }).map { it.first }
    }
}
