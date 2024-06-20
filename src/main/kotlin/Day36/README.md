### Problem: Task Scheduler

**Description:**
You need to create a Kotlin program that manages a simple task scheduler. The program should allow users to add tasks with deadlines, list all tasks sorted by their deadlines, and mark tasks as completed.

**Requirements:**

1. **Task Management:**
    - A task should have a title, a description, a deadline, and a status indicating whether it is completed or not.
    - The program should allow adding new tasks.
    - The program should allow marking tasks as completed.

2. **Listing Tasks:**
    - The program should list all tasks sorted by their deadlines in ascending order.
    - Completed tasks should be shown at the end of the list regardless of their deadlines.

**Input:**
1. A list of tasks, where each task has a title, description, deadline (as a string in the format "yyyy-MM-dd"), and a status.

**Output:**
- A sorted list of tasks by their deadlines. Completed tasks should be listed at the end.

### Example:

**Tasks Input:**
```kotlin
val tasks = listOf(
    Task("Task 1", "Description 1", "2024-06-25", false),
    Task("Task 2", "Description 2", "2024-06-20", false),
    Task("Task 3", "Description 3", "2024-06-22", true),
    Task("Task 4", "Description 4", "2024-06-21", false)
)
```

**Expected Output:**
```
Task 2: Description 2, Deadline: 2024-06-20, Completed: false
Task 4: Description 4, Deadline: 2024-06-21, Completed: false
Task 1: Description 1, Deadline: 2024-06-25, Completed: false
Task 3: Description 3, Deadline: 2024-06-22, Completed: true
```

### Tasks:

1. Create a `Task` data class to store the task information.
2. Write functions to add new tasks, mark tasks as completed, and list all tasks sorted by their deadlines.
3. Implement the main logic to demonstrate adding tasks, marking them as completed, and listing them in the required order.

### Solution Template:

```kotlin
data class Task(
    val title: String,
    val description: String,
    val deadline: String,
    var isCompleted: Boolean
)

class TaskScheduler {
    private val tasks = mutableListOf<Task>()

    fun addTask(task: Task) {
        // Add task to the list
    }

    fun markTaskAsCompleted(title: String) {
        // Mark the task with the given title as completed
    }

    fun listTasks(): List<Task> {
        // Return tasks sorted by deadline, with completed tasks at the end
    }
}

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
```

### Instructions:
1. Implement the `Task` data class.
2. Implement the `addTask` function in the `TaskScheduler` class.
3. Implement the `markTaskAsCompleted` function in the `TaskScheduler` class.
4. Implement the `listTasks` function in the `TaskScheduler` class.
5. Implement the main function to demonstrate adding tasks, marking them as completed, and listing them in the required order.