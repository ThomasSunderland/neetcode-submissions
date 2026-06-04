class Solution {
    fun getConcatenation(nums: IntArray): IntArray {
        val size = nums.size
        val ans = IntArray(size * 2)

        for (index in nums.indices) {
            val num = nums[index]
            ans[index] = num
            ans[index + size] = num
        }

        return ans
    }
}
