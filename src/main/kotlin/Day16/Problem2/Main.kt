package Day16.Problem2

fun main() {
    println("Enter some text:")
    val text = readLine() ?: ""

    val wordCounts = countWordFrequencies(text)

    println("Word frequencies:")
    wordCounts.forEach { (word, count) -> println("$word: $count") }
}

fun countWordFrequencies(text: String): Map<String, Int> {
    val cleanedWords = text.split(Regex("[^\\w]+"))
        .filter { it.isNotEmpty() }
        .map { it.toLowerCase() }

    val wordCounts = mutableMapOf<String, Int>()
    cleanedWords.forEach { word ->
        val count = wordCounts.getOrDefault(word, 0) + 1
        wordCounts[word] = count
    }

    return wordCounts.toMap()
}
