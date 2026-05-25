class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val numsLength = nums.size
        
        val prefixes = IntArray(numsLength)
        prefixes[0] = 1
        for (index in 1 until numsLength) {
            prefixes[index] = prefixes[index - 1] * nums[index - 1]
        }
        println(prefixes.joinToString())

        var suffixProduct = 1
        val suffixes = IntArray(numsLength)
        for (index in numsLength - 1 downTo 0) {
            suffixes[index] = suffixProduct
            suffixProduct *= nums[index]
        }
        println(suffixes.joinToString())

        val output = IntArray(numsLength)
        nums.forEachIndexed { index, num ->
            output[index] = prefixes[index] * suffixes[index]
        }
        println(output.joinToString())

        return output
    }
}
