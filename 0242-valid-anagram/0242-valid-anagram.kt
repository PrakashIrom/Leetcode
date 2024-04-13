class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        
        var countS=Array(26){0}
        var countT=Array(26){0}
        
        if(t.length!=s.length)
            return false
        
        for(i in 0 until s.length){
            countS[s[i]-'a']++
            countT[t[i]-'a']++
        }
        
        for(i in 0 until 26){
            if(countS[i]!=countT[i])
                return false
        }
        
        return true
    }
}