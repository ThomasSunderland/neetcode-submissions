class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        if (nums.size == 0) return 0

        val numsSet = nums.toSet()
        val considerations = mutableListOf<Int>()

        for (num in numsSet) {
            if (!numsSet.contains(num - 1)) {
                considerations.add(num)
            }
        }

        var maxConsecutive = 0
        for (consideration in considerations) {
            var count = 1
            while (numsSet.contains(consideration + count)) {
                count++
            }

            if (count > maxConsecutive) maxConsecutive = count
        }

        //println(considerations)

        return maxConsecutive
    }
}
