package Day13.Problem2

fun main() {
    val university = University()

    val course1 = university.addCourse(Course("c001", "Mathematics", "Dr. Smith"))
    val course2 = university.addCourse(Course("c002", "Physics", "Dr. Johnson"))

    val student1 = university.registerStudent(Student("s001", "Alice"))
    val student2 = university.registerStudent(Student("s002", "Bob"))

    val enrollment1 = university.enrollStudent(Enrollment("e001", "s001", "c001", "2024-06-01"))
    val enrollment2 = university.enrollStudent(Enrollment("e002", "s002", "c002", "2024-06-02"))

    println(university.getCourseDetails("c001"))
    println(university.getCourseDetails("c002"))

    println(university.getStudentDetails("s001"))
    println(university.getStudentDetails("s002"))

    println(university.viewAllCourses())
    println(university.viewAllStudents())

    println(university.viewStudentInCourse("c001"))
    println(university.viewStudentInCourse("c002"))
}