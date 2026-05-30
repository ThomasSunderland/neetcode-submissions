class Solution {
    fun isPalindrome(s: String): Boolean {
        var newS: String = ""
        for (char in s.lowercase()) {
            if (char.isDigit() || (char >= 'a' && char <= 'z')) {
                newS += char.toString()
            }
        }

        return newS == newS.reversed()
    }
}
