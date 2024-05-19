## Problem: Task Management System

You are tasked with creating a simplified task management system. The system should allow adding tasks, marking tasks as completed, and listing all tasks with their statuses. Each task has a unique ID, a description, and a status indicating whether it is pending or completed.

#### Requirements:
1. Implement a data class `Task` with the following properties:
    - `id`: Int (unique identifier for the task)
    - `description`: String
    - `status`: String (default is `"pending"`, can be `"completed"`)

2. Implement a class `TaskManager` with the following methods:
    - `addTask(description: String)`: Adds a new task to the system.
    - `completeTask(id: Int)`: Marks the specified task as completed.
    - `getAllTasks()`: Returns a list of all tasks.
    - `getPendingTasks()`: Returns a list of tasks that are currently pending.
    - `getCompletedTasks()`: Returns a list of tasks that are currently completed.

#### Example Usage:

```kotlin
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
```

### Explanation of Methods:
1. **`addTask(description: String)`**: Adds a new task with the given description and a unique ID. The status is set to "pending" by default.
2. **`completeTask(id: Int)`**: Marks the specified task as completed by setting its status to "completed".
3. **`getAllTasks()`**: Returns a list of all tasks.
4. **`getPendingTasks()`**: Returns a list of tasks that are currently pending.
5. **`getCompletedTasks()`**: Returns a list of tasks that are currently completed.

This problem simulates a simple task management system, allowing you to practice object-oriented programming and basic list management in Kotlin.

### Reflection: 
damn I got this problem I've actually solved it on my own. A problem requirement with only List to solve is just easy for me since the problem is so niche. 