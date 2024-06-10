**Task Management Application**

### Problem Description:
You need to create a simple task management application that allows users to create, view, update, and delete tasks. Each task should have a title, description, status (e.g., pending, in-progress, completed), and due date. The application should be able to filter tasks based on their status and due date.

### Requirements:
1. **Task Class**: Create a `Task` class with the following properties:
    - `id`: A unique identifier for the task.
    - `title`: The title of the task.
    - `description`: A brief description of the task.
    - `status`: The current status of the task (pending, in-progress, completed).
    - `dueDate`: The due date for the task.

2. **TaskManager Class**: Create a `TaskManager` class to manage the tasks with the following functionalities:
    - `addTask(task: Task)`: Add a new task to the list.
    - `viewTasks()`: View all tasks.
    - `updateTask(id: Int, newTask: Task)`: Update the task with the given id.
    - `deleteTask(id: Int)`: Delete the task with the given id.
    - `filterTasksByStatus(status: String)`: Filter tasks based on their status.
    - `filterTasksByDueDate(dueDate: String)`: Filter tasks based on their due date.

3. **Main Function**: Create a main function to demonstrate the usage of the `TaskManager` class:
    - Add a few tasks.
    - Display all tasks.
    - Update a task.
    - Delete a task.
    - Filter tasks by status.
    - Filter tasks by due date.