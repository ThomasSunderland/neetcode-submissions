class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val setOfNumbers = mutableSetOf<Int>()
        for (number in nums) {
            if (setOfNumbers.add(number) == false) {
                return true
            }
        }

        return false
    }
}
