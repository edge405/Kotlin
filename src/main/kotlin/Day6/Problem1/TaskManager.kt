package Day6.Problem1

class TaskManager {
    private val tasks = mutableListOf<Task>()
    var counter = 0
    fun addTask(description: String){
        counter++
        tasks.add(Task(counter, description))
    }
    fun completeTask(id: Int){
        val task = tasks.find { it.id == id }
        if(task != null){
            task.status = "completed"
        } else {
            println("Task not found.")
        }
    }
    fun getAllTasks(): List<Task>{
        return tasks
    }
    fun getPendingTasks(): List<Task> {
        return tasks.filter { it.status == "pending" }
    }
    fun getCompletedTasks(): List<Task>{
        return tasks.filter { it.status == "completed" }
    }
}