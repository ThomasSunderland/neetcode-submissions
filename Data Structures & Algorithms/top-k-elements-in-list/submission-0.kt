class Solution {

    // Input: nums = [1,2,2,3,3,3], k = 2
    // Output: [2,3]

    // Bucket Size = 6

    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        //val buckets = Array(nums.size) { mutableListOf<Int>() }

        val tryMap = mutableMapOf<Int, Int>()
        for (num in nums) {
            tryMap[num] = tryMap.getOrDefault(num, 0) + 1
        }

        val topValues = tryMap.values.sorted().takeLast(k)
        return tryMap.filterValues { it in topValues }.keys.toIntArray()
    }
}
