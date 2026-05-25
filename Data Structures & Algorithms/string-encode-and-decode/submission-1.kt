class Solution {

    fun encode(strs: List<String>): String {
        var encoded_string = ""
        if (strs.isEmpty()) return encoded_string

        for (str in strs) {
            encoded_string += "$str||"
        }

        encoded_string = encoded_string
        return encoded_string//.also { println("encode()- '$it'") }
    }

    fun decode(str: String): List<String> {
        if (str == "") return emptyList<String>()

        var strCopy = str
        var decoded_strs = mutableListOf<String>()

        var startIndex = 0
        var endIndex = strCopy.indexOf("||")
        while(strCopy.length > 0 || endIndex != -1) {
            //  01234567890
            // "HELLO||WORLD"
            val parsedString = 
                if (endIndex != -1) {
                    strCopy.substring(startIndex, endIndex)
                } else {
                    strCopy
                }

            decoded_strs.add(parsedString)//.also { println("decode() - adding '$parsedString'") }

            if (endIndex == -1) {
                strCopy = ""
            } else {
                strCopy = strCopy.substring(endIndex + 2)
                endIndex = strCopy.indexOf("||")
            }
            
            //println("decode()- strCopy = $strCopy")
        }

        

        return decoded_strs
    }
}
