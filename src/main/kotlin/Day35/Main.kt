package Day35

fun calculateAverage(scores: List<Int>): Double {
    return scores.average()
}

fun determineGrade(averageScore: Double): String {
    return when {
        averageScore >= 90 -> "A"
        averageScore >= 80 -> "B"
        averageScore >= 70 -> "C"
        averageScore >= 60 -> "D"
        else -> "F"
    }
}

fun main() {
    val students = listOf(
        Student("Alice", listOf(85, 90, 78)),
        Student("Bob", listOf(92, 88, 95)),
        Student("Charlie", listOf(70, 65, 80)),
        Student("David", listOf(55, 60, 58))
    )

    for (student in students) {
        val averageScore = calculateAverage(student.scores)
        val grade = determineGrade(averageScore)
        println("Name: ${student.name}, Average Score: ${"%.2f".format(averageScore)}, Grade: $grade")
    }
}
