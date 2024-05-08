class Solution {
    fun isSubsequence(s: String, t: String): Boolean {
       
        var str=""
        var n=0
        
        for(i in 0 until s.length){
            
            for(j in n until t.length){
                if(s[i]==t[j]){
                    str+=t[j]
                    n=j+1
                    break
                }
            }
        }
        
        if(str.contains(s)) return true
        
        return false
    }
}