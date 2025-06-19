class Solution {
    fun lengthOfLastWord(s: String): Int {
        val str = s.trim()

        for(i in str.length-1 downTo 0){
            if(str[i] == ' '){
                return str.length-i-1
            }
        }
        return str.length
    }
}