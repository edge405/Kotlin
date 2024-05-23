### Problem: Fitness Tracking System

You are tasked with developing a fitness tracking system that allows users to log their workouts, track their progress, and set fitness goals. The system should provide functionalities for managing user accounts, logging workouts, viewing workout history, and setting fitness goals.

#### Requirements:

1. **User Class**:
    - **Attributes**:
        - `username: String`
        - `name: String`
        - `workouts: MutableList<Workout>`
        - `goals: MutableList<Goal>`
    - **Methods**:
        - `logWorkout(workout: Workout)`: Add a workout to the user's workout history.
        - `setGoal(goal: Goal)`: Add a fitness goal for the user.
        - `getWorkoutHistory(): List<Workout>`: Retrieve the user's workout history.
        - `getGoals(): List<Goal>`: Retrieve the user's fitness goals.

2. **Workout Data Class**:
    - **Attributes**:
        - `date: String`
        - `type: String`
        - `duration: Int` (duration in minutes)
        - `caloriesBurned: Int`

3. **Goal Data Class**:
    - **Attributes**:
        - `description: String`
        - `targetDate: String`
        - `isAchieved: Boolean`
    - **Methods**:
        - `markAsAchieved()`: Mark the goal as achieved.

4. **FitnessTrackingSystem Class**:
    - **Attributes**:
        - `users: MutableList<User>`
    - **Methods**:
        - `createUser(username: String, name: String): User`: Create a new user and add them to the system.
        - `getUser(username: String): User?`: Retrieve a user by their username.
        - `logWorkout(username: String, workout: Workout)`: Log a workout for a specific user.
        - `setGoal(username: String, goal: Goal)`: Set a fitness goal for a specific user.
        - `viewWorkoutHistory(username: String): List<Workout>`: View the workout history for a specific user.
        - `viewGoals(username: String): List<Goal>`: View the fitness goals for a specific user.

### Example Usage:
```kotlin
fun main() {
    val fitnessSystem = FitnessTrackingSystem()

    // Create user accounts
    val user1 = fitnessSystem.createUser("johndoe", "John Doe")
    val user2 = fitnessSystem.createUser("janedoe", "Jane Doe")

    // Log workouts for users
    fitnessSystem.logWorkout("johndoe", Workout("2023-05-01", "Running", 30, 300))
    fitnessSystem.logWorkout("johndoe", Workout("2023-05-02", "Swimming", 45, 400))
    fitnessSystem.logWorkout("janedoe", Workout("2023-05-01", "Cycling", 60, 500))

    // Set goals for users
    fitnessSystem.setGoal("johndoe", Goal("Run a marathon", "2023-10-01"))
    fitnessSystem.setGoal("janedoe", Goal("Lose 5 kg", "2023-08-01"))

    // View workout history
    val johnWorkoutHistory = fitnessSystem.viewWorkoutHistory("johndoe")
    println("John's Workout History: $johnWorkoutHistory")

    val janeWorkoutHistory = fitnessSystem.viewWorkoutHistory("janedoe")
    println("Jane's Workout History: $janeWorkoutHistory")

    // View fitness goals
    val johnGoals = fitnessSystem.viewGoals("johndoe")
    println("John's Fitness Goals: $johnGoals")

    val janeGoals = fitnessSystem.viewGoals("janedoe")
    println("Jane's Fitness Goals: $janeGoals")
}
````

### SHEEESH what a problem. I've learned something new on how to use "?" operator, it's useful when managing the null values that causes the system to have bug, and it's painful for a lot of developers including me LOL