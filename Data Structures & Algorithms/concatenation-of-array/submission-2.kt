class Solution {
    fun getConcatenation(nums: IntArray): IntArray {
        val ans = IntArray(nums.size * 2)

        for (index in nums.indices) {
            val num = nums[index]
            ans[index] = num
            ans[index + nums.size] = num
        }

        return ans
    }
}
