class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val sums = mutableMapOf<Int, Int>()

        for (index in nums.indices) {
            // pass1 = 7 - 3 = 4
            // pass2 = 7 - 4 = 3
            val difference = target - nums[index]

            // pass1 = null
            // pass2 = 0
            val indexOfMatch = sums[nums[index]]

            if (indexOfMatch == null) {
                // sums[4] = 0
                // sums[3] = 1
                sums[difference] = index
            } else {
                return intArrayOf(indexOfMatch, index)
            }
        }

        return intArrayOf()
    }
}
