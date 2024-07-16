package Day45

class EmployeeManager {
    private val employees = mutableListOf<Employee>()

    fun addEmployee(id: Int, name: String, position: String) {
        if (employees.any { it.id == id }) {
            println("Employee with id $id already exists.")
        } else {
            employees.add(Employee(id, name, position))
        }
    }

    fun removeEmployee(id: Int) {
        val employee = employees.find { it.id == id }
        if (employee != null) {
            employees.remove(employee)
        } else {
            println("Employee with id $id not found.")
        }
    }

    fun displayEmployees() {
        if (employees.isEmpty()) {
            println("No employees found.")
        } else {
            employees.forEach { println(it) }
        }
        println()
    }

}