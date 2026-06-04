class Solution {
    fun getConcatenation(nums: IntArray): IntArray {
        val size = nums.size
        val ans = IntArray(size * 2)

        for (index in nums.indices) {
            ans[index] = nums[index]
            ans[index + size] = nums[index]
        }

        return ans
    }
}
