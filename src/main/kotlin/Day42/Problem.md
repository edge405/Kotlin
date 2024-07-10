Sure! Here's a Kotlin problem that involves recursion and manipulation of lists:

## Problem: Find the Nth Fibonacci Number Using Recursion

### Description
The Fibonacci sequence is a series of numbers where each number is the sum of the two preceding ones, usually starting with 0 and 1. The sequence goes like this: 0, 1, 1, 2, 3, 5, 8, 13, 21, and so on.

Write a Kotlin function `fibonacci(n: Int): Int` that returns the Nth Fibonacci number using recursion.

### Constraints
- You may assume that `n` is a non-negative integer.
- The function should be able to compute Fibonacci numbers up to `n = 20`.

### Example
```kotlin
fun main() {
    println(fibonacci(0))  // Output: 0
    println(fibonacci(1))  // Output: 1
    println(fibonacci(2))  // Output: 1
    println(fibonacci(3))  // Output: 2
    println(fibonacci(4))  // Output: 3
    println(fibonacci(5))  // Output: 5
    println(fibonacci(10)) // Output: 55
}

fun fibonacci(n: Int): Int {
    // Your code here
}
```

### Task
Implement the `fibonacci` function in Kotlin to solve the problem.