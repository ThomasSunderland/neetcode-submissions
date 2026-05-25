class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val sums = mutableMapOf<Int, Int>()

        for (index in nums.indices) {
            if (sums[nums[index]] == null) {
                sums[target - nums[index]] = index
            } else {
                return intArrayOf(sums[nums[index]]!!, index)
            }
        }

        return intArrayOf()
    }
}
