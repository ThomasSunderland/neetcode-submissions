class Solution {

    // Input: nums = [1,2,2,3,3,3], k = 2
    // Output: [2,3]
    // Bucket Size = 6
    fun topKFrequent(nums: IntArray, k: Int): IntArray {

        // TODO: Bucket Sort
        
        // (1) count frequencies
        val count = mutableMapOf<Int, Int>()
        for (num in nums) { // O(n)
            count[num] = count.getOrDefault(num, 0) + 1
        }

        // (2) bucket: index = frequency, value = list of numbers with that frequency
        val buckets = Array(nums.size + 1) { mutableListOf<Int>() }
        for ((num, frequency) in count) { // O(n)
            buckets[frequency].add(num)
        }

        // (3) Gather top k frequent elements
        val result = IntArray(k)
        var index = 0
        for (frequency in buckets.size -1 downTo 1) {
            for (num in buckets[frequency]) {
                result[index++] = num
                if (index == k) return result
            }
        }

        return result

        // // Solution 01 (Brute Force)
        // val tryMap = mutableMapOf<Int, Int>()
        // for (num in nums) {
        //     tryMap[num] = tryMap.getOrDefault(num, 0) + 1
        // }

        // val topValues = tryMap.values.sorted().takeLast(k)
        // return tryMap.filterValues { it in topValues }.keys.toIntArray()
    }
}
