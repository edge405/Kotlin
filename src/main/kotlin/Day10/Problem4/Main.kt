package Day10.Problem4

fun countPrimes(numbers: List<Int>): Int {
    return numbers.count { num -> (2..num / 2).none { num % it == 0 } && num > 1 }
}
/// WOWOWOWOWOWOWOWOWOWOWOW

fun main() {
    val numbers = listOf(2, 3, 5, 7, 11, 13, 17, 19, 20, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 100)
    println(countPrimes(numbers)) // Output should be 25
}