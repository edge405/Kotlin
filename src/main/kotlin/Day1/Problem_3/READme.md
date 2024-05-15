## Problem: Student Grade Manager
Implement a class GradeManager in Kotlin to manage students' grades. Each student has a name (String) and a list of grades (List<Int>). Your class should support adding students, adding grades to a student, calculating the average grade for a student, and listing all students with their average grades.

### Requirements:
#### Data Class:

*Student(name: String, grades: MutableList<Int>)*
##### Class: GradeManager

*Methods:*
* fun addStudent(name: String): Adds a new student. 
* fun addGrade(name: String, grade: Int): Adds a grade to the specified student.
* fun getAverageGrade(name: String): Double?: Returns the average grade for the specified student, or null if the student does not exist.
* fun listStudents(): List<String>: Returns a list of students with their average grades formatted as "Name: AverageGrade".


##### Reflection:
I find this problem as a tough problem because the syntax are new to me. The syntax is actually intimidating at first like the question mark "?" I don't get this at first but the power of research I could easily understand this symbol. I've learned a lot to this problem like the attributes of List can be nullable which you can use it to reserve the data insertion for later. 
