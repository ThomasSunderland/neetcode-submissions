class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val numFrequency = mutableMapOf<Int, Int>()

        nums.sort()

        var index = 0
        while (index < nums.size) {
            val num = nums[index]

            val firstIndex = index
            val lastIndex = nums.lastIndexOf(num)
            val occurrences = lastIndex - firstIndex + 1

            numFrequency[num] = occurrences
            
            index = lastIndex + 1
        }

        val topValues = numFrequency.values.sorted().takeLast(k)
        return numFrequency.filterValues { it in topValues }.keys.toIntArray()
    }
}
