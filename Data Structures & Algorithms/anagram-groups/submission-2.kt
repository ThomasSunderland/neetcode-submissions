class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val groupedStrings = mutableMapOf<String, MutableList<String>>()
        for (str in strs) {
            val key = str.toCharArray().sorted().toString()

            // var strValue = 0
            // for (char in str) {
            //     strValue += char.hashCode()
            // }

            if (groupedStrings.containsKey(key)) {
                groupedStrings[key]?.add(str)
            } else {
                groupedStrings[key] = mutableListOf()
                groupedStrings[key]?.add(str)
            }
        }

        return groupedStrings.values.toList()
    }
}
