import Day1.Problem_3.GradeManager

fun main() {
    val manager = GradeManager()

    manager.addStudent("Alice")
    manager.addStudent("Bob")

    manager.addGrade("Alice", 85)
    manager.addGrade("Alice", 90)
    manager.addGrade("Bob", 78)
    manager.addGrade("Bob", 82)

    println(manager.getAverageGrade("Alice"))
    // Output: 87.5

    println(manager.getAverageGrade("Bob"))
    // Output: 80.0

    println(manager.listStudents())
    // Output: ["Alice: 87.5", "Bob: 80.0"]

    val nonExistentStudent = manager.getAverageGrade("Charlie")
    println(nonExistentStudent)
    // Output: null
}