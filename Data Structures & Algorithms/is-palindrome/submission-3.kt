class Solution {
    // s="Never odd or even"
    //    01234567890123456

    // s=".a"
    //    01
    fun isPalindrome(s: String): Boolean {
        var startIndex = 0
        var endIndex = s.length - 1

        while (startIndex != endIndex && startIndex < s.length && endIndex >= 0) {
            val startChar = s.lowercase().get(startIndex)
            //println("HERE- 02... $startChar ($startIndex)")
            if (!startChar.isDigit() && !(startChar >= 'a' && startChar <= 'z')) {
                if (startIndex < s.length - 1) startIndex++
                continue
            }

            val endChar = s.lowercase().get(endIndex)
            // println("HERE- 03... $endChar ($endIndex)")
            if (!endChar.isDigit() && !(endChar >= 'a' && endChar <= 'z')) {
                if (endIndex > 0) endIndex--
                continue
            }

            // println("HERE- 04... Comparing '$startChar' to '$endChar'")
            if (startChar != endChar) return false

            if (startIndex == s.length -1 && endIndex == 0) break
            
            if (startIndex < s.length - 1) startIndex++
            if (endIndex > 0) endIndex--
        }

        // println("HERE- 05, $startIndex, $endIndex")
        if (startIndex >= s.length || endIndex < 0) return false
        
        return s.lowercase()[startIndex] == s.lowercase()[endIndex]

        // var newS: String = ""
        // for (char in s.lowercase()) {
        //     if (char.isDigit() || (char >= 'a' && char <= 'z')) {
        //         newS += char.toString()
        //     }
        // }

        // return newS == newS.reversed()
    }
}
