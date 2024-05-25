### Problem: School Course Management System

You need to create a school course management system that allows students to enroll in courses, and manage course details and student enrollments. The system should provide functionalities for managing courses, students, and enrollments.

#### Requirements:

1. **Course Data Class**:
    - **Attributes**:
        - `courseId: String`
        - `courseName: String`
        - `instructor: String`
        - `students: MutableList<Student>`
    - No methods required.

2. **Student Data Class**:
    - **Attributes**:
        - `studentId: String`
        - `name: String`
    - No methods required.

3. **CourseManager Class**:
    - **Attributes**:
        - `courses: MutableList<Course>`
        - `students: MutableList<Student>`
    - **Methods**:
        - `addCourse(course: Course)`: Add a new course.
        - `registerStudent(student: Student)`: Register a new student.
        - `enrollStudent(courseId: String, studentId: String)`: Enroll a student in a course.
        - `getCourseDetails(courseId: String): Course?`: Retrieve course details.
        - `viewAllCourses(): List<Course>`: View all courses.

### Example Usage:
```kotlin
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
```
This problem helps you practice managing collections of data and implementing basic CRUD operations in Kotlin.

### Shesh this implementation is so niche, so I find it easy solve
![img.png](img.png)