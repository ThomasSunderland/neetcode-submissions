class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        if (nums.size == 0) return 0

        val numsSet = nums.toHashSet()
        val considerations = mutableListOf<Int>()

        for (num in numsSet) {
            if (!numsSet.contains(num - 1)) {
                considerations.add(num)
            }
        }

        println("Considerations: $considerations, SetCount: ${numsSet.size}")

        var maxConsecutive = 0
        for (consideration in considerations) {
            var count = 1
            while (numsSet.contains(consideration + count)) {
                count++
            }

            if (count > maxConsecutive) maxConsecutive = count
            if (count > numsSet.size / considerations.size) return maxConsecutive
        }

        return maxConsecutive
    }
}
