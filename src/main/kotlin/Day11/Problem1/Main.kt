package Day11.Problem1

fun main() {
    val courseManager = CourseManager()

    // Add courses
    val course1 = Course("c001", "Mathematics", "Dr. Smith")
    val course2 = Course("c002", "History", "Dr. Jones")

    courseManager.addCourse(course1)
    courseManager.addCourse(course2)

    // Register students
    val student1 = Student("s001", "Alice")
    val student2 = Student("s002", "Bob")
    val student3 = Student("s003", "Charlie")

    courseManager.registerStudent(student1)
    courseManager.registerStudent(student2)
    courseManager.registerStudent(student3)

    // Enroll students in courses
    courseManager.enrollStudent("c001", "s001")
    courseManager.enrollStudent("c001", "s002")
    courseManager.enrollStudent("c002", "s003")

    // View course details
    val courseDetails1 = courseManager.getCourseDetails("c001")
    println("Course Details for c001: $courseDetails1")

    val courseDetails2 = courseManager.getCourseDetails("c002")
    println("Course Details for c002: $courseDetails2")

    // View all courses
    val courses = courseManager.viewAllCourses()
    println("All Courses: $courses")
}
