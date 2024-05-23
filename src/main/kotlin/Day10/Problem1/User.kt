package Day10.Problem1

class User(
    val username: String,
    val name: String,
    private val workouts: MutableList<Workout> = mutableListOf(),
    private val goals: MutableList<Goal> = mutableListOf()
) {
    fun logWorkout(workout: Workout){
        workouts.add(workout)
    }
    fun setGoal(goal: Goal){
        goals.add(goal)
    }
    fun getWorkoutHistory(): List<Workout>{
        return workouts
    }
    fun getGoals(): List<Goal>{
        return goals
    }
}