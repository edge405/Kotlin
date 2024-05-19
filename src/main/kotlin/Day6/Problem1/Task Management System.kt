package Day6.Problem1

fun main() {
    val taskManager = TaskManager()

    taskManager.addTask("Write project report")
    taskManager.addTask("Read a book")
    taskManager.addTask("Buy groceries")

    println("All Tasks: ${taskManager.getAllTasks()}")
    // Expected: [Task(id=1, description="Write project report", status="pending"), Task(id=2, description="Read a book", status="pending"), Task(id=3, description="Buy groceries", status="pending")]

    taskManager.completeTask(1)
    taskManager.completeTask(3)

    println("Pending Tasks: ${taskManager.getPendingTasks()}")
    // Expected: [Task(id=2, description="Read a book", status="pending")]

    println("Completed Tasks: ${taskManager.getCompletedTasks()}")
    // Expected: [Task(id=1, description="Write project report", status="completed"), Task(id=3, description="Buy groceries", status="completed")]
}