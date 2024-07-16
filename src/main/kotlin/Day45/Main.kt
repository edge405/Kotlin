package Day45

fun main() {
    val manager = EmployeeManager()

    manager.addEmployee(1, "Alice", "Developer")
    manager.addEmployee(2, "Bob", "Designer")
    manager.addEmployee(3, "Charlie", "Manager")

    manager.displayEmployees()

    manager.removeEmployee(2)

    manager.displayEmployees()
}
