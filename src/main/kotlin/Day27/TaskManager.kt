package Day27

class TaskManager {
    private val tasks = mutableListOf<Task>()

    fun addTask(task: Task){
        this.tasks.add(task)
    }
    fun viewTasks() : List<Task>{
        return tasks
    }
    fun updateTask(id: Int, newTask: Task){
        var task = tasks.indexOfFirst { it.id == id }
        if(task != -1){
            tasks[task] = newTask
        }
    }
    fun deleteTask(id: Int){
        tasks.removeAt(id)
    }
    fun filterTasksByStatus(status: String): List<Task>{
        return tasks.filter { it.status.equals(status, ignoreCase = true)}
    }
    fun filterTasksByDueDate(dueDate: String): List<Task> {
        return tasks.filter { it.dueDate == dueDate }
    }
}