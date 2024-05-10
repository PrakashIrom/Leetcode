class Solution {
    fun checkInclusion(s1: String, s2: String): Boolean {
          
        var s1f=IntArray(26){0}
        var s2f=IntArray(26){0}
        
        if(s1.length>s2.length) return false
        
        for(i in 0 until s1.length){
            
            s1f[s1[i]-'a']++
            s2f[s2[i]-'a']++
            
        }
        
        if(checkFreq(s1f,s2f)) return true 
        
        for(i in s1.length until s2.length){
            
            s2f[s2[i-s1.length]-'a']--
            s2f[s2[i]-'a']++
            
            if(checkFreq(s1f,s2f)) return true 
            
        }
        
        return false
    }
    
    fun checkFreq(s1:IntArray, s2:IntArray):Boolean{
        
        for(i in 0 until 26){
            
            if(s1[i]!=s2[i]) return false 
            
        }
        
        return true
    }
}