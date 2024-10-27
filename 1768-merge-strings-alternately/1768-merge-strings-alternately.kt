class Solution {
    fun mergeAlternately(word1: String, word2: String): String {
        // the first for loop should be iterated until the size of the minimum string length between the two
        // the second while loop should be start from p1/p2 until the length of the maximum string length
        var p:Int = 0
        var result = ""
        
        while(p< minOf(word1.length, word2.length)){
            result+=word1[p]
            result+=word2[p]
            p++
        }
        
        if(word1.length>word2.length){
            while(p<word1.length){
                result+=word1[p++]
            }
        }
        else if(word1.length<word2.length){
            while(p<word2.length){
                result+=word2[p++]
            }
        }
        
        return result
    }
}