package Day4.Problem1

fun mostFrequentWord(text: String): String {
    val wordRegex = Regex("\\w+") // Matches alphanumeric sequences (words)
    val wordCounts = mutableMapOf<String, Int>() // Map to store word frequencies

    // Iterate through each word in the text
    wordRegex.findAll(text.lowercase()).forEach { matchResult ->
        val word = matchResult.value
        wordCounts[word] = wordCounts.getOrDefault(word, 0) + 1 // Increment count
    }

    // Find the most frequent word(s) and their frequency
    val maxFrequency = wordCounts.values.maxOrNull() ?: 0
    val mostFrequentWords = wordCounts.filterValues { it == maxFrequency }

    // Return the alphabetically first word in case of a tie
    return mostFrequentWords.keys.minOrNull() ?: ""
}

fun main() {
    println(mostFrequentWord("The quick brown fox jumps over the lazy dog."))   // Output: "the"
    println(mostFrequentWord("This is a test. Is this a test?"))             // Output: "a" (alphabetically first)
}

// I don't know what the fuck is going on here