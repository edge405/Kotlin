package Day34

fun cleanUserInputs(inputs: List<String?>): List<String> {
    return inputs
        .filterNotNull()
        .map { it.trim() }
        .map { it.lowercase() }
        .filter { it.isNotEmpty() }
}

// Test the function with the provided example
fun main() {
    val inputs: List<String?> = listOf(" Alice ", null, "BOB", "  ", "  Charlie  ", null, "  dave  ", "Eve")
    val cleanedInputs: List<String> = cleanUserInputs(inputs)
    println(cleanedInputs)
}
