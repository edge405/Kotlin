package Day13.Problem2

data class Student(
    val studentId: String,
    val name: String,
    val courseEnrolled: MutableList<Course> = mutableListOf()
)
