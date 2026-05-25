class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        var output = mutableListOf<Int>()

        nums.forEachIndexed { index, num -> 
            var outputEntry: Int? = null
            for (numIndex in nums.indices) {
                if (numIndex == index) continue
                
                if (outputEntry == null) {
                    outputEntry = nums[numIndex]
                } else {
                    outputEntry *= nums[numIndex]
                }
            }
            output.add(outputEntry ?: 0)
        }

        return output.toIntArray()
    }
}
