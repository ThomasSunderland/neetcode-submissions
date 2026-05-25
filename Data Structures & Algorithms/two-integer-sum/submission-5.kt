class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val sums = mutableMapOf<Int, Int>()

        for (index in nums.indices) {
            val indexOfMatch = sums[nums[index]]

            if (indexOfMatch == null) {
                val difference = target - nums[index]
                sums[difference] = index
            } else {
                return intArrayOf(indexOfMatch, index)
            }
        }

        return intArrayOf()
    }
}
