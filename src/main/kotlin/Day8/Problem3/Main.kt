package Day8.Problem3

fun main() {
    println("Enter numbers separated by spaces:")
    val input = readLine() ?: ""
    val numbers = input.split(" ").mapNotNull { it.toIntOrNull() }
    // Find the second largest number
    val secondLargest = findSecondLargest(numbers)

    // Print the result
    println("The second largest number is: $secondLargest")

}

fun findSecondLargest(numbers: List<Int>): Any {
    val final = numbers.toSet().sorted()
    val result = final.toList()
    return result[result.size - 2]
}