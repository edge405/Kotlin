### **Problem: Longest Substring Without Repeating Characters**

You are given a string. Write a Kotlin function to find the length of the longest substring without repeating characters.

Your task is to implement the function `lengthOfLongestSubstring` which takes a string as input and returns the length of the longest substring that does not contain any repeating characters.

Example:
```kotlin
fun main() {
    val s1 = "abcabcbb"
    val result1 = lengthOfLongestSubstring(s1)
    println("Length of Longest Substring Without Repeating Characters: $result1") // Expected output: 3 ("abc")

    val s2 = "bbbbb"
    val result2 = lengthOfLongestSubstring(s2)
    println("Length of Longest Substring Without Repeating Characters: $result2") // Expected output: 1 ("b")

    val s3 = "pwwkew"
    val result3 = lengthOfLongestSubstring(s3)
    println("Length of Longest Substring Without Repeating Characters: $result3") // Expected output: 3 ("wke")
}
```

Expected output for the example strings:
- For "abcabcbb", the longest substring without repeating characters is "abc", so the output is 3.
- For "bbbbb", the longest substring without repeating characters is "b", so the output is 1.
- For "pwwkew", the longest substring without repeating characters is "wke", so the output is 3.

You need to implement the `lengthOfLongestSubstring` function to correctly find and return the length of the longest substring without repeating characters.