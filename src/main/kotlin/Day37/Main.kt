package Day37

fun main() {
    val users = listOf(
        User(1, listOf(2, 3, 4)),
        User(2, listOf(1, 3)),
        User(3, listOf(1, 2, 5)),
        User(4, listOf(1)),
        User(5, listOf(3))
    )

    val network = SocialNetwork(users)

    println("Friend recommendations for user 1: ${network.recommendFriends(1)}")
    println("Friend recommendations for user 2: ${network.recommendFriends(2)}")
}