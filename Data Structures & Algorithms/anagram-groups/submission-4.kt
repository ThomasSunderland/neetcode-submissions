class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val output = mutableMapOf<String, MutableList<String>>()

        for (str in strs) {
            val key = String(str.toCharArray().apply { sort() })

            if (output.containsKey(key)) {
                output[key]?.add(str)
            } else {
                output[key] = mutableListOf(str)
            }
        }

        return output.values.toList()
    }
}
