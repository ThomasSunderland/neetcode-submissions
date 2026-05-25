class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        return nums.distinct().size != nums.size

        // val setOfNumbers = mutableSetOf<Int>()
        // for (number in nums) {
        //     if (setOfNumbers.add(number) == false) {
        //         return true
        //     }
        // }

        // return false
    }
}
