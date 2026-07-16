class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val indices = mutableMapOf<Int, Int>()

        // 4, 3, 7
        for ((index, num) in nums.withIndex()) {
            if (indices.containsKey(target - num)) {
                return intArrayOf(indices[target - num] ?: -1, index)
            } else {
                indices[num] = index
            }
        }

        return intArrayOf()
    }
}
