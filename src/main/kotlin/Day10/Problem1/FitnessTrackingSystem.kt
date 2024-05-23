package Day10.Problem1

class FitnessTrackingSystem {
    val users = mutableListOf<User>()

    fun createUser(username: String, name: String): User{
        val user = User(username = username, name = name)
        users.add(user)
        return user
    }
    fun getUser(username: String): User? {
        return users.find { it.username == username }
    }
    fun logWorkout(username: String, workout: Workout) {
        users.find { it.username == username }?.logWorkout(workout)
    }
    fun setGoal(username: String, goal: Goal){
        users.find { it.username == username }?.setGoal(goal)
    }
    fun viewWorkoutHistory(username: String): List<Workout>?{
        return users.find { it.username == username }?.getWorkoutHistory()
    }
    fun viewGoals(username: String): List<Goal>?{
        return users.find { it.username == username }?.getGoals()
    }
}