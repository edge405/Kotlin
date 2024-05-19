package Day5.Problem3

fun longestConsecutive(nums: List<Int>): Int {
    if (nums.isEmpty()) return 0

    val numSet = nums.toSet()
    var longestStreak = 0

    for (num in numSet) {
        if (!numSet.contains(num - 1)) {
            var currentNum = num
            var currentStreak = 1

            while (numSet.contains(currentNum + 1)) {
                currentNum += 1
                currentStreak += 1
            }
            longestStreak = maxOf(longestStreak, currentStreak)
        }
    }

    return longestStreak
}

fun main() {
    val nums1 = listOf(100, 4, 200, 1, 3, 2)
    val result1 = longestConsecutive(nums1)
    println("Length of Longest Consecutive Sequence: $result1") // Expected output: 4 (sequence: 1, 2, 3, 4)

    val nums2 = listOf(0, 0, -1)
    val result2 = longestConsecutive(nums2)
    println("Length of Longest Consecutive Sequence: $result2") // Expected output: 2 (sequence: -1, 0)

    val nums3 = listOf(1, 2, 0, 1)
    val result3 = longestConsecutive(nums3)
    println("Length of Longest Consecutive Sequence: $result3") // Expected output: 3 (sequence: 0, 1, 2)

    val nums4 = listOf(9, 1, 4, 7, 3, -1, 0, 5, 8, -1, 6)
    val result4 = longestConsecutive(nums4)
    println("Length of Longest Consecutive Sequence: $result4") // Expected output: 7 (sequence: -1, 0, 1, 3, 4, 5, 6, 7, 8, 9)

    val nums5 = listOf(1, 3, 5, 2, 4)
    val result5 = longestConsecutive(nums5)
    println("Length of Longest Consecutive Sequence: $result5") // Expected output: 5 (sequence: 1, 2, 3, 4, 5)
}