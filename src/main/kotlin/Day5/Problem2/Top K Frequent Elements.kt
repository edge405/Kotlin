package Day5.Problem2

fun main() {
    val nums1 = listOf(1, 1, 1, 2, 2, 3)
    val k1 = 2
    val result1 = topKFrequent(nums1, k1)
    println("Top $k1 Frequent Elements: $result1") // Expected output: [1, 2]

    val nums2 = listOf(1)
    val k2 = 1
    val result2 = topKFrequent(nums2, k2)
    println("Top $k2 Frequent Elements: $result2") // Expected output: [1]

    val nums3 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val k3 = 3
    val result3 = topKFrequent(nums3, k3)
    println("Top $k3 Frequent Elements: $result3") // Expected output: [1, 2, 3] (since all elements are unique, any 3 elements can be correct)

    val nums4 = listOf(1, 1, 2, 2, 3, 3, 3, 4, 4, 4, 4)
    val k4 = 2
    val result4 = topKFrequent(nums4, k4)
    println("Top $k4 Frequent Elements: $result4") // Expected output: [4, 3]

    val nums5 = listOf(4, 1, -1, 2, -1, 2, 3)
    val k5 = 2
    val result5 = topKFrequent(nums5, k5)
    println("Top $k5 Frequent Elements: $result5") // Expected output: [-1, 2]

    val nums6 = listOf(1, 1, 2, 2, 3, 3, 3)
    val k6 = 3
    val result6 = topKFrequent(nums6, k6)
    println("Top $k6 Frequent Elements: $result6") // Expected output: [3, 1, 2]
}

fun topKFrequent(nums: List<Int>, k: Int): List<Int> {
    val frequencyMap = nums.groupingBy { it }.eachCount()

    return frequencyMap.entries
        .sortedByDescending { it.value }
        .take(k)
        .map { it.key }
}
// Damn lambdas if fuckin killin my brain