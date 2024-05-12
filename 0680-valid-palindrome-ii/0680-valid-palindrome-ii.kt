class Solution {
    fun validPalindrome(s: String): Boolean {
        
        var flag=true
        var l=0
        var r=s.length-1
        
        while(l<r){
            if(s[l]!=s[r] && flag){
                flag=false
                l++
                continue
            }
            else if(s[l]==s[r]){
            l++
            r--
            }
            else{ break}
        }
        
        if(l==r || l>r) return true
        
        l=0
        r=s.length-1
        flag=true
        
         while(l<r){
            if(s[l]!=s[r] && flag){
                flag=false
                r--
                continue
            }
            else if(s[l]==s[r]){
                l++
                r--
            }
            else{
                return false
            }
        }
         
        return true
    }
}