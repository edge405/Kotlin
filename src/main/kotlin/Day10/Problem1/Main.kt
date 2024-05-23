package Day10.Problem1

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