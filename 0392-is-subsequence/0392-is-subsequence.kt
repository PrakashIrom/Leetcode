class Solution {
    fun isSubsequence(s: String, t: String): Boolean {
       
        var j=0
        var i=0
        
       while(i<s.length && j<t.length){
           if(s[i]==t[j]) i++
           j++
       }
        return (i==s.length)
    }
}