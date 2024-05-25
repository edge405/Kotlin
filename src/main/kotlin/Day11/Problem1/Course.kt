package Day11.Problem1

data class Course(
    val courseId: String,
    val courseName: String,
    val instructor: String,
    val students: MutableList<Student> = mutableListOf()
)
