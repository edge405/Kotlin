### Problem: Student Grade Calculator

**Description:**
You are tasked with creating a Kotlin program that calculates the final grade of students based on their scores in multiple subjects. The program should read the student information, calculate their average score, and determine their grade based on the average score. The grading criteria are as follows:

- Average score >= 90: Grade A
- Average score >= 80 and < 90: Grade B
- Average score >= 70 and < 80: Grade C
- Average score >= 60 and < 70: Grade D
- Average score < 60: Grade F

**Input:**
1. A list of students where each student has a name and a list of subject scores. For example:
    ```kotlin
    val students = listOf(
        Student("Alice", listOf(85, 90, 78)),
        Student("Bob", listOf(92, 88, 95)),
        Student("Charlie", listOf(70, 65, 80)),
        Student("David", listOf(55, 60, 58))
    )
    ```

**Output:**
For each student, print their name, average score, and grade. For example:
```
Name: Alice, Average Score: 84.33, Grade: B
Name: Bob, Average Score: 91.67, Grade: A
Name: Charlie, Average Score: 71.67, Grade: C
Name: David, Average Score: 57.67, Grade: F
```

**Constraints:**
- The list of students can have any number of students.
- Each student can have any number of subject scores.
- Scores are integers between 0 and 100.

**Tasks:**
1. Create a `Student` data class to store the student name and their scores.
2. Write a function to calculate the average score of a student.
3. Write a function to determine the grade based on the average score.
4. Write the main logic to process a list of students and print their name, average score, and grade.