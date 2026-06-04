class Solution {
    fun getConcatenation(nums: IntArray): IntArray {
        val ans = IntArray(nums.size * 2)
        nums.forEachIndexed { index, num ->
            ans[index] = num
            ans[index + nums.size] = num
        }

        return ans
    }
}
