package Day27

fun main() {
    val taskManager = TaskManager()

    val task1 = Task(1, "Task 1", "Description 1", "Pending", "2024-06-10")
    val task2 = Task(2, "Task 2", "Description 2", "In-Progress", "2024-06-11")
    val task3 = Task(3, "Task 3", "Description 3", "Completed", "2024-06-12")

    taskManager.addTask(task1)
    taskManager.addTask(task2)
    taskManager.addTask(task3)

    println("All Tasks:")
    taskManager.viewTasks().forEach { println(it) }

    val updatedTask = Task(1, "Updated Task 1", "Updated Description 1", "Completed", "2024-06-15")
    taskManager.updateTask(1, updatedTask)

    println("\nTasks after update:")
    taskManager.viewTasks().forEach { println(it) }

    taskManager.deleteTask(2)

    println("\nTasks after deletion:")
    taskManager.viewTasks().forEach { println(it) }

    println("\nTasks with status 'Completed':")
    taskManager.filterTasksByStatus("Completed").forEach { println(it) }

    println("\nTasks with due date '2024-06-12':")
    taskManager.filterTasksByDueDate("2024-06-12").forEach { println(it) }
}