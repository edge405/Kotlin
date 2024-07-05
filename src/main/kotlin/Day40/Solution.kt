package Day40

fun isPalindrome(input: String): Boolean {

    val cleanInput = input.toLowerCase().replace("[^a-zA-Z0-9]".toRegex(), "")

    return cleanInput == cleanInput.reversed()
}

fun main() {
    // Example usage and testing:
    val testString1 = "Madam"
    val testString2 = "Racecar"
    val testString3 = "hello"

    println("\"$testString1\" is a palindrome: ${isPalindrome(testString1)}") // true
    println("\"$testString2\" is a palindrome: ${isPalindrome(testString2)}") // true
    println("\"$testString3\" is a palindrome: ${isPalindrome(testString3)}") // false
}
