package Day36

class TaskScheduler {
    private val tasks = mutableListOf<Task>()

    fun addTask(task: Task) {
        // Add task to the list
        tasks.add(task)
    }

    fun markTaskAsCompleted(title: String) {
        // Mark the task with the given title as completed
        val task = tasks.find { it.title == title }
        if (task != null) {
            task.isCompleted = true
        } else {
            println("Task is empty")
        }
    }

    fun listTasks(): List<Task> {
        // Return tasks sorted by deadline, with completed tasks at the end
        return tasks.sortedWith(compareBy<Task> { it.isCompleted }.thenBy { it.deadline })
    }
}