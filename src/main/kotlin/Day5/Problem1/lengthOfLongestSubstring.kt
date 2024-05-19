package Day5.Problem1

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

//fun lengthOfLongestSubstring(s1: String): Int {
//    val map = HashMap<Char, Int>()
//
//    for(str in s1){
//        map.put(str, map.getOrDefault(str, 0)+1)
//    }
//    return map.size
//} : This is my solution

fun lengthOfLongestSubstring(s: String): Int {
    val map = HashMap<Char, Int>()
    var maxLength = 0
    var start = 0

    for (end in s.indices) {
        val char = s[end]
        if (map.containsKey(char)) {
            start = maxOf(map[char]!! + 1, start) // Move start to the right of the last occurrence of char
        }
        map[char] = end // Update the last seen index of char
        maxLength = maxOf(maxLength, end - start + 1) // Update the max length
    }

    return maxLength
}
// This is a perfect solution that uses sliding window approach
