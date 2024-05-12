class Solution {
    fun repeatedSubstringPattern(s: String): Boolean {
     
        var n=s.length
        var sub=""
        var res=""
        
        if(s.length==1) return false
        
        for(i in 0 until n/2){
            
            sub+=s[i]
            
            if(n%sub.length==0){
                
                repeat(n/sub.length)
                {
                    res+=sub
                }
                if(res==s) return true
                res=""
            }
            
        }
        
        return false
    }
}