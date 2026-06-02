class Solution {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var maxOnes = 0
        var consecutiveOnes = 0
        for (num in nums) {
            if (num == 1) {
                consecutiveOnes++
            }
            else {
                if (maxOnes < consecutiveOnes) {
                    maxOnes = consecutiveOnes
                }
                consecutiveOnes = 0
            }
        }

        return if (consecutiveOnes > maxOnes) consecutiveOnes else maxOnes
    }
}
