## **Problem: Employee Management System**

Create a simple employee management system in Kotlin. The system should allow you to add employees, remove employees, and display a list of all employees. Each employee should have the following attributes:

- `id` (Integer): A unique identifier for the employee.
- `name` (String): The name of the employee.
- `position` (String): The position of the employee.

The system should provide the following functionality:

1. Add a new employee.
2. Remove an employee by their `id`.
3. Display the list of all employees.

**Requirements:**

1. Create an `Employee` data class with the attributes `id`, `name`, and `position`.
2. Create an `EmployeeManager` class with methods to add, remove, and display employees.
3. Ensure that each employee added to the system has a unique `id`.
4. The display method should print out the list of employees in a user-friendly format.

**Sample Output:**

```kotlin
fun main() {
    val manager = EmployeeManager()

    // Adding employees
    manager.addEmployee(1, "Alice", "Developer")
    manager.addEmployee(2, "Bob", "Designer")
    manager.addEmployee(3, "Charlie", "Manager")

    // Displaying employees
    manager.displayEmployees()

    // Removing an employee
    manager.removeEmployee(2)

    // Displaying employees again
    manager.displayEmployees()
}
```

Expected output:

```
Employee(id=1, name=Alice, position=Developer)
Employee(id=2, name=Bob, position=Designer)
Employee(id=3, name=Charlie, position=Manager)

Employee(id=1, name=Alice, position=Developer)
Employee(id=3, name=Charlie, position=Manager)
```