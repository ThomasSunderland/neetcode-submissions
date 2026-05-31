class Solution {

    // Input: nums = [1,2,2,3,3,3], k = 2
    // Output: [2,3]
    // Bucket Size = 7
    fun topKFrequent(nums: IntArray, k: Int): IntArray {

        // first let's count the number of occurrences of each number in the input array
        // e.g. 3 (map key) occurs 3 times (map value)
        val count = mutableMapOf<Int, Int>()
        for (num in nums) {
            count[num] = count.getOrDefault(num, 0) + 1
        }

        // second, let's bucket the frequency of each number into an array of lists
        // e.g. all numbers that occur 3 times will go into buckets[3]
        // note: the array should be nums.size + 1
        val buckets = Array(nums.size + 1) { mutableListOf<Int>() }
        for ((number, frequency) in count) {
            buckets[frequency].add(number)
        }

        // third we need to loop through the buckets and grab the top k elements
        // note: ignore the element at index 0 because frequency = 0 should always be 0 numbers
        var index = 0
        val retVal = IntArray(k) // create a return value with a size equal to k
        for (frequency in buckets.size - 1 downTo 1) {
            for (number in buckets[frequency]) {
                retVal[index++] = number
                if (index == k) return retVal
            }
        }

        return retVal







        // // Solution 02: Bucket Sort
        // // (1) count frequencies
        // // count[1] = 1
        // // count[2] = 2
        // // count[3] = 3
        // //
        // // count[7] = 2
        // val count = mutableMapOf<Int, Int>()
        // for (num in nums) { // O(n)
        //     count[num] = count.getOrDefault(num, 0) + 1
        // }

        // // (2) bucket: index = frequency, value = list of numbers with that frequency
        // // bucket[0] = emptyList
        // // bucket[1] = 1
        // // bucket[2] = 1 + 1 (2)
        // // bucket[3] = 1 + 1 + 1 (3)

        // // [7, 7] = count<7, 2> = buckets[2] = 7
        // val buckets = Array(nums.size + 1) { mutableListOf<Int>() }
        // for ((num, frequency) in count) { // O(n)
        //     buckets[frequency].add(num)
        // }

        // // (3) Gather top k frequent elements
        // val result = IntArray(k)
        // var index = 0
        // for (frequency in buckets.size -1 downTo 1) {
        //     for (num in buckets[frequency]) {
        //         result[index++] = num
        //         if (index == k) return result
        //     }
        // }

        // return result

        // Solution 01 (Brute Force)
        // val tryMap = mutableMapOf<Int, Int>()
        // for (num in nums) {
        //     tryMap[num] = tryMap.getOrDefault(num, 0) + 1
        // }

        // val topValues = tryMap.values.sorted().takeLast(k)
        // return tryMap.filterValues { it in topValues }.keys.toIntArray()
    }
}
