class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        val mapS = mutableMapOf<Int, Int>()

        for (char in s.toCharArray()) {
            val charCode = char.code
            val count = mapS.getOrDefault(charCode, 0)

            mapS[charCode] = count + 1
            //println("$charCode appears ${mapS[charCode]} times")
        }

        //println("\n")

        for (char in t.toCharArray()) {
            val charCode = char.code
            //println("Checking: $charCode")

            val count = mapS.get(charCode)
            if (count == null) return false

            if (count == 1) mapS.remove(charCode)
            else mapS[charCode] = count - 1
        }

        return mapS.isEmpty()
    }
}
