class Solution {
    fun longestPalindrome(s: String): String {
        var len=0
        var result=""
        
        for(i in 0 until s.length)
        {   
            // for odd palindrome
            var left=i
            var right=i
           
            while(left>=0 && right<s.length && s[left]==s[right]){
                if((right-left+1)>len){
                    len=right-left+1
                    result=s.substring(left,right+1)
                }
                left--
                right++
            }
            
            //for even palindrome
            var low=i
            var high=i+1
            
             while(low>=0 && high<s.length && s[low]==s[high]){
                if((high-low+1)>len){
                    len=high-low+1
                    result=s.substring(low,high+1)
                }
                low--
                high++
            }
        }
        return result
    }
}