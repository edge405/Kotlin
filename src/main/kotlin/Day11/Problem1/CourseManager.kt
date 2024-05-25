package Day11.Problem1

class CourseManager {
    private val courses = mutableListOf<Course>()
    private val students = mutableListOf<Student>()

    fun addCourse(course: Course){
        courses.add(course)
    }
    fun registerStudent(student: Student){
        students.add(student)
    }
    fun enrollStudent(courseId: String, studentId: String){
        val student = students.find { it.studentId == studentId }
        if (student != null) {
            courses.find { it.courseId == courseId }?.students?.add(student)
        } else {
            println("Student not found")
        }
    }
    fun getCourseDetails(courseId: String): Course?{
        return courses.find { it.courseId == courseId }
    }
    fun viewAllCourses(): List<Course>{
        return courses
    }
}