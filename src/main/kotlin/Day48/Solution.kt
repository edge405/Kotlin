package Day48

fun main() {
    // Sample input string
    val input = "Hello, world! Hello, Kotlin. Kotlin is awesome. Kotlin is fun."

    // Convert the string to lowercase and remove punctuation
    val words = input
        .toLowerCase() // Convert to lowercase
        .replace(Regex("[^a-z\\s]"), "") // Remove punctuation
        .split("\\s+".toRegex()) // Split by whitespace

    // Create a frequency map to count each word
    val frequencyMap = mutableMapOf<String, Int>()
    for (word in words) {
        if (word.isNotEmpty()) {
            frequencyMap[word] = frequencyMap.getOrDefault(word, 0) + 1
        }
    }

    // Sort by frequency in descending order, then by word alphabetically
    val sortedWords = frequencyMap.entries.sortedWith(compareByDescending<Map.Entry<String, Int>> { it.value }
        .thenBy { it.key })

    // Print the words and their frequencies
    for ((word, frequency) in sortedWords) {
        println("$word: $frequency")
    }
}
