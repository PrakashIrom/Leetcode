class Solution {
    fun reverseVowels(s: String): String {
        
        var result = StringBuffer(s)
        var l = 0
        var h = result.length-1
        val vowels = listOf('a','e','i','o','u','A','E','I','O','U')
        
        while(l<h){
            
            if(!vowels.contains(result[l])) l++
            
            if(!vowels.contains(result[h])) h--
            
            if(vowels.contains(result[l]) && vowels.contains(result[h])){
                val tem = result[l]
                result.setCharAt(l, result[h])
                result.setCharAt(h, tem)
                l++
                h--
            }
            
        }
        
        return result.toString()
        
    }
}