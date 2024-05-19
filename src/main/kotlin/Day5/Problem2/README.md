
---

## Problem: Top K Frequent Elements

You are given a list of integers and an integer `k`. Write a Kotlin function to return the `k` most frequent elements in the list.

#### Function Signature
```kotlin
fun topKFrequent(nums: List<Int>, k: Int): List<Int>
```

#### Example:
```kotlin
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
    println("Top $k3 Frequent Elements: $result3") // Expected output: Any 3 elements since all are unique

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
```

### Explanation of Test Cases:
1. **Typical Case**: The list `nums1` has multiple repeated elements, and the top 2 frequent elements are `1` and `2`.
2. **Single Element**: The list `nums2` contains only one element, so the top 1 frequent element is `1`.
3. **All Unique Elements**: The list `nums3` contains all unique elements. Any 3 elements can be the output since all have the same frequency.
4. **Multiple Frequencies**: The list `nums4` has elements with different frequencies. The top 2 frequent elements are `4` and `3`.
5. **Including Negative Numbers**: The list `nums5` contains both positive and negative numbers. The top 2 frequent elements are `-1` and `2`.
6. **Different Frequencies with Top K**: The list `nums6` has elements with different frequencies, and the top 3 frequent elements are `3`, `1`, and `2`.

---

## Damn Lambdas is fuckin killin my brain