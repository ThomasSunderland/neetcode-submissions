class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val setOfNumbers = mutableSetOf<Int>()
        for (number in nums) {
            if (setOfNumbers.contains(number)) {
                return true
            } else {
                setOfNumbers.add(number)
            }
        }

        return false
    }
}
