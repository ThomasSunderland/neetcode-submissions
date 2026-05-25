class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val setOfNumbers = mutableSetOf<Int>()
        for (num in nums) {
            if (!setOfNumbers.add(num)) {
                return true
            }
        }

        return false
    }
}
