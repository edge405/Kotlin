package Day36

fun main() {
    val scheduler = TaskScheduler()

    scheduler.addTask(Task("Task 1", "Description 1", "2024-06-25", false))
    scheduler.addTask(Task("Task 2", "Description 2", "2024-06-20", false))
    scheduler.addTask(Task("Task 3", "Description 3", "2024-06-22", true))
    scheduler.addTask(Task("Task 4", "Description 4", "2024-06-21", false))

    println("Tasks before completion:")
    scheduler.listTasks().forEach { println(it) }

    scheduler.markTaskAsCompleted("Task 2")

    println("\nTasks after completion:")
    scheduler.listTasks().forEach { println(it) }
}
