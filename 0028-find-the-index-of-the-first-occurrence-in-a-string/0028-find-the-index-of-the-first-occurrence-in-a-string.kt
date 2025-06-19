class Solution {
    fun strStr(haystack: String, needle: String): Int {
        
        for(i in 0 .. haystack.length-needle.length){
            var count = 0
            for(j in i until i+needle.length){
                if(haystack[j] == needle[count]) count++
                else break
            }
            if(count==needle.length) return i
        }

        return -1
    }
}