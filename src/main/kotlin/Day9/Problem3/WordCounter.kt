package Day9.Problem3

fun main() {
    val sentence = "This is a simple sentence. Another sentence is here."

    val words = sentence.replace(Regex("[^a-zA-Z ]"), "").toLowerCase().split(" ")

    val wordCountMap = mutableMapOf<String, Int>()
    for (word in words) {
        if (word.isNotBlank()) {
            wordCountMap[word] = wordCountMap.getOrDefault(word, 0) + 1
        }
    }

    val sortedWordCount = wordCountMap.toSortedMap()

    for ((word, count) in sortedWordCount) {
        println("Word: $word, Frequency: $count")
    }
}

// Dayum Let's go!!