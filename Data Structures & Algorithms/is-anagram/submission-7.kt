class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        var sVal = 0
        var tVal = 0

        for (ch in s.toCharArray()) {
            sVal += ch.code * ch.code
        }

        for (ch in t.toCharArray()) {
            tVal += ch.code * ch.code
        }

        return sVal == tVal
    }
}
