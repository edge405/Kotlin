package Day13.Problem2

class University {
    private val courses = mutableListOf<Course>()
    private val students = mutableListOf<Student>()
    private val enrollments = mutableListOf<Enrollment>()

    fun addCourse(course: Course){
        courses.add(course)
    }
    fun registerStudent(student: Student){
        students.add(student)
    }
    fun enrollStudent(enrollment: Enrollment){
        val student = students.find { it.studentId == enrollment.studentId }
        val course = courses.find { it.courseId == enrollment.courseId }

        if (course != null) {
            student?.courseEnrolled?.add(course)
        }
    }
    fun getCourseDetails(courseId: String) : Course?{
        return courses.find { it.courseId == courseId }
    }
    fun getStudentDetails(studentId: String): Student?{
        return students.find { it.studentId == studentId }
    }
    fun viewAllCourses(): List<Course>{
        return courses
    }
    fun viewAllStudents(): List<Student>{
        return students
    }
    fun viewStudentInCourse(courseId: String): Course?{
        return courses.find { it.courseId == courseId }
    }
}