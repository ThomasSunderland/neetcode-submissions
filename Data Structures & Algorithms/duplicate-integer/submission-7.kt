class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {

        val numbers = mutableMapOf<Int, Boolean>()
        for (number in nums) {
            if (numbers.containsKey(number))
                return true
            else {
                numbers[number] = true
            }
        }

        return false
    }
}
