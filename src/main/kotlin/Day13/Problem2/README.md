### Problem: Course Enrollment System

Design a Course Enrollment System for a university. This system should manage courses, students, and enrollments. The system should be able to add new courses, register students, and allow students to enroll in courses. Additionally, the system should provide functionality to view course details, student details, and the list of students enrolled in a specific course.

### Requirements:

1. **Course Class**:
    - `courseId`: Unique identifier for the course.
    - `courseName`: Name of the course.
    - `instructor`: Instructor of the course.
    - `studentsEnrolled`: List of students enrolled in the course.

2. **Student Class**:
    - `studentId`: Unique identifier for the student.
    - `name`: Name of the student.
    - `enrolledCourses`: List of courses the student is enrolled in.

3. **Enrollment Class**:
    - `enrollmentId`: Unique identifier for the enrollment.
    - `studentId`: Unique identifier for the student.
    - `courseId`: Unique identifier for the course.
    - `enrollmentDate`: Date of enrollment.

4. **UniversityManager Class**:
    - `addCourse(course: Course)`: Adds a new course to the system.
    - `registerStudent(student: Student)`: Registers a new student in the system.
    - `enrollStudent(enrollment: Enrollment)`: Enrolls a student in a course.
    - `getCourseDetails(courseId: String)`: Retrieves details of a specific course.
    - `getStudentDetails(studentId: String)`: Retrieves details of a specific student.
    - `viewAllCourses()`: Retrieves a list of all courses.
    - `viewAllStudents()`: Retrieves a list of all students.
    - `viewStudentsInCourse(courseId: String)`: Retrieves a list of students enrolled in a specific course.

### Example Usage:

1. Add courses:
    - Course 1: `courseId = "c001"`, `courseName = "Mathematics"`, `instructor = "Dr. Smith"`.
    - Course 2: `courseId = "c002"`, `courseName = "Physics"`, `instructor = "Dr. Johnson"`.

2. Register students:
    - Student 1: `studentId = "s001"`, `name = "Alice"`.
    - Student 2: `studentId = "s002"`, `name = "Bob"`.

3. Enroll students in courses:
    - Enrollment 1: `enrollmentId = "e001"`, `studentId = "s001"`, `courseId = "c001"`, `enrollmentDate = "2024-06-01"`.
    - Enrollment 2: `enrollmentId = "e002"`, `studentId = "s002"`, `courseId = "c002"`, `enrollmentDate = "2024-06-02"`.

4. View details:
    - Get details of course with `courseId = "c001"`.
    - Get details of student with `studentId = "s001"`.
    - View all courses.
    - View all students.
    - View students enrolled in course with `courseId = "c001"`.
####
<p align="center">
<img src="https://s3.amazonaws.com/pix.iemoji.com/images/emoji/apple/ios-12/256/loudly-crying-face.png"
</p>