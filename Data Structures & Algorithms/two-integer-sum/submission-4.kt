class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val sums = mutableMapOf<Int, Int>()

        for (index in nums.indices) {
            val indexOfMatch = sums[nums[index]]

            if (indexOfMatch == null) {
                sums[target - nums[index]] = index
            } else {
                return intArrayOf(indexOfMatch, index)
            }
        }

        return intArrayOf()
    }
}
