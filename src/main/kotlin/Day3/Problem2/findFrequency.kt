package Day3.Problem2

/**
 * Problem:
 * You are given a list of integers. Write a Kotlin function to find the frequency
 * of each integer in the list and store the result in a HashMap, where the keys are
 * the integers and the values are their frequencies. Return this HashMap as the
 * result.Your task is to implement the function findFrequency which takes a list of
 * integers as input and returns a HashMap containing the frequency of each integer in the list.
 */

fun findFrequency(numbers: List<Int>): HashMap<Int, Int> {
    val nums = HashMap<Int, Int>()
    numbers.forEach {
        nums.put(it, nums.getOrDefault(it, 0) + 1)
    }
    return nums
}

fun main() {
    val numbers = listOf(1, 2, 3, 4, 1, 2, 3, 1, 2, 1)
    val frequencyMap = findFrequency(numbers)
    println("Frequency Map: $frequencyMap")
}
/**
 * I ask chatGPT to rate my code in a scale of 1-10 here's the response:
 *
 * I'd rate your code around 9 out of 10. It's concise, efficient, and effectively
 * solves the problem. The only minor improvement I could suggest is using the put
 * function directly instead of put followed by getOrDefault, which would slightly simplify
 * the code without affecting its functionality:
 *
 * fun findFrequency(numbers: List<Int>): HashMap<Int, Int> {
 *     val nums = HashMap<Int, Int>()
 *     numbers.forEach { nums[it] = nums.getOrDefault(it, 0) + 1 }
 *     return nums
 * }
 *
 * But even without this change, your code is very clear and effective. Great job!
 */