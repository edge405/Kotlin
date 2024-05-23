### Problem Description: Movie Recommendation System

#### Overview
You are tasked with developing a Movie Recommendation System in Kotlin. The system should provide recommendations to users based on their preferences and the ratings of other users.

#### Requirements

1. **Movie Class**:
    - Each movie should have an ID, title, genre, and release year.

2. **User Class**:
    - Each user should have an ID and a name.

3. **Rating Class**:
    - Each rating should include the user ID, movie ID, and the rating value (an integer between 1 and 5).

4. **Movie Database**:
    - Implement a mechanism to store movies, users, and ratings.

5. **Functionality**:
    - **Add Movie**: Allow adding a new movie to the database.
    - **Add User**: Allow adding a new user to the database.
    - **Add Rating**: Allow a user to rate a movie.
    - **Get Recommendations**: Provide movie recommendations for a user based on their ratings and the ratings of other users with similar tastes.

6. **Recommendation Algorithm**:
    - Implement a recommendation algorithm to suggest movies to users. You can use collaborative filtering or any other suitable algorithm.

7. **User Interface**:
    - Implement a command-line interface or any other user-friendly interface to interact with the system.

#### Constraints
- Focus on designing a modular and efficient system.
- Ensure that the recommendation algorithm is scalable and provides accurate recommendations.
- Handle edge cases such as users with no ratings or movies with no ratings appropriately.

#### Example Usage
1. **Add Movie**:
    ```kotlin
    addMovie(Movie(1, "The Shawshank Redemption", "Drama", 1994))
    ```

2. **Add User**:
    ```kotlin
    addUser(User(1, "Alice"))
    ```

3. **Add Rating**:
    ```kotlin
    addRating(Rating(1, 1, 5)) // Alice rates "The Shawshank Redemption" 5 stars
    ```

4. **Get Recommendations**:
    ```kotlin
    val recommendations = getRecommendations(1) // Get recommendations for user Alice
    ```

#### Considerations
- Design a clear and concise class structure for movies, users, and ratings.
- Choose appropriate data structures and algorithms to efficiently store and process data.
- Implement a recommendation algorithm that balances accuracy and performance.
- Provide a user-friendly interface for users to interact with the system.

This problem requires a combination of software design, algorithm implementation, and data management skills to build an effective Movie Recommendation System in Kotlin.