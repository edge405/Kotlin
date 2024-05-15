package Day2.Problem1

fun isPalindrome(str: String): Boolean{
    val cleanedStr = str.replace(Regex("[^A-Za-z0-9]"), "").toLowerCase()
    return cleanedStr == cleanedStr.reversed()
}

fun main() {
    println(isPalindrome("racecar")) // Output: true
    println(isPalindrome("Racecar")) // Output: true
    println(isPalindrome("hello"))  // Output: false
    println(isPalindrome("A man, a plan, a canal: Panama")) // Output: true
}