class Solution {
    fun findAnagrams(s: String, p: String): List<Int> {
        
        val result = mutableListOf<Int>()
        var pat = IntArray(26){0}
        var text = IntArray(26){0}
        
        if(p.length>s.length) return result
        
        for(i in 0 until p.length){
            pat[p[i]-'a']++
            text[s[i]-'a']++
        }
        
        if(checkCount(text,pat)) result.add(0)
        
        for(i in p.length until s.length){
            
          text[s[i-p.length]-'a']--
          text[s[i]-'a']++
            
            if(checkCount(text,pat)) result.add(i-p.length+1)
            
        }
        
        return result
    }
    
    fun checkCount(txt:IntArray, p:IntArray): Boolean {
        for(i in 0 until 26){
            if(txt[i] != p[i]) return false
        }
        return true
    }
}