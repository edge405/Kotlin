### Problem: Social Network Friend Recommendations

**Description:**
You need to create a Kotlin program that recommends friends to users based on mutual friends. In a social network, a user can have a list of friends. The program should suggest new friends to a user by identifying other users who share the most mutual friends with them.

**Requirements:**

1. **User Data:**
    - A user should have a unique identifier (user ID) and a list of friends (represented by user IDs).

2. **Friend Recommendation:**
    - For a given user, the program should recommend friends who are not already in their friend list but share the most mutual friends with them.

**Input:**
1. A list of users, where each user has a user ID and a list of friends. For example:
   ```kotlin
   val users = listOf(
       User(1, listOf(2, 3, 4)),
       User(2, listOf(1, 3)),
       User(3, listOf(1, 2, 5)),
       User(4, listOf(1)),
       User(5, listOf(3))
   )
   ```

**Output:**
- For a given user, print the recommended friends sorted by the number of mutual friends in descending order. If there are multiple users with the same number of mutual friends, sort them by user ID in ascending order.

### Example:

**Input:**
```kotlin
val users = listOf(
    User(1, listOf(2, 3, 4)),
    User(2, listOf(1, 3)),
    User(3, listOf(1, 2, 5)),
    User(4, listOf(1)),
    User(5, listOf(3))
)
```

**For user 1, the recommendations should be:**
```
User 5
```

**For user 2, the recommendations should be:**
```
User 4, User 5
```

**Constraints:**
- There are no duplicate user IDs.
- Each user ID is a positive integer.

### Tasks:

1. Create a `User` data class to store the user information.
2. Write a function to find and recommend friends based on mutual friends.
3. Write the main logic to demonstrate friend recommendations for a given user.

### Instructions:
1. Implement the `User` data class.
2. Implement the `recommendFriends` function in the `SocialNetwork` class.
3. Implement the main function to demonstrate friend recommendations for given users.