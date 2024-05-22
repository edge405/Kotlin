### Problem: Find the Second Largest Number

Write a Kotlin program that finds the second largest number in a list of integers.

#### Requirements:
1. The program should read a list of integers from the user.
2. It should find the second largest number in the list.
3. If the list contains fewer than 2 distinct numbers, the program should print a message indicating that there aren't enough distinct numbers.

### Example:
```
Input: [10, 5, 20, 8, 20, 15]
Output: 15
```
Explanation: The largest number in the list is 20, and the second largest distinct number is 15.

#### Steps:
1. Read a list of integers from the user.
2. Find the second largest distinct number.
3. Print the second largest number or an appropriate message if there aren't enough distinct numbers.

### Actually ChatGPT provided a solution according to this problem. Here's the solution: 

````kotlin
fun main() {
    // Read input from the user
    println("Enter numbers separated by spaces:")
    val input = readLine() ?: ""
    val numbers = input.split(" ").mapNotNull { it.toIntOrNull() }

    // Function to find the second largest number
    fun findSecondLargest(nums: List<Int>): Int? {
        if (nums.size < 2) return null
        
        val distinctNumbers = nums.toSet().toList()
        if (distinctNumbers.size < 2) return null
        
        val sortedNumbers = distinctNumbers.sortedDescending()
        return sortedNumbers[1]
    }

    // Find the second largest number
    val secondLargest = findSecondLargest(numbers)

    // Print the result
    if (secondLargest != null) {
        println("The second largest number is: $secondLargest")
    } else {
        println("There aren't enough distinct numbers.")
    }
}
````
### So I'm thinking to asked ChatGPT to rate my code in a scale 1-10 so here's the response:
I'd rate your solution a solid 8 out of 10. Here's why:

**What's Great:**
1. **Readability:** Your code is clear and easy to follow. It's well-structured, making it easy to understand the logic behind finding the second largest number.
2. **Correctness:** Your solution correctly finds the second largest number in the list of integers provided by the user.
3. **Efficiency:** Converting the list to a set and then sorting it ensures that you're dealing with distinct numbers efficiently.
4. **Error Handling:** You handle the case where there are fewer than 2 distinct numbers appropriately, returning `null` as specified.

**Suggestions for Improvement:**
1. **Unnecessary Conversion:** You convert the set `final` back to a list `result`. While this doesn't affect functionality, it's an extra step that could be avoided.
2. **Variable Naming:** Naming your variables `final` and `result` doesn't provide much context. Consider using more descriptive names, such as `distinctNumbers` instead of `final`.
3. **Inline Comments:** Adding some inline comments to explain the logic behind certain steps could enhance the readability further, especially for someone new to the codebase.

Overall, your solution is well-done! With a few minor adjustments, it could be even clearer and more maintainable. Keep up the good work!


### I'm looking forward to this suggestion :))