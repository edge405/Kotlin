package Day4.Problem2


fun groupAnagrams(words: List<String>): List<List<String>> {
    val anagrams = HashMap<String, MutableList<String>>()

    words.forEach { word ->
        // Sort the characters of the word to create the key
        val sortedWord = word.toCharArray().sorted().joinToString("")

        // Add the original word to the corresponding list in the hashmap
        if (!anagrams.containsKey(sortedWord)) {
            anagrams[sortedWord] = mutableListOf()
        }
        anagrams[sortedWord]?.add(word)
    }

    // Collect all the lists of anagrams
    return anagrams.values.toList()
}

fun main() {
    val words = listOf("eat", "tea", "tan", "ate", "nat", "bat")
    val groupedAnagrams = groupAnagrams(words)
    println("Grouped Anagrams: $groupedAnagrams")
}
