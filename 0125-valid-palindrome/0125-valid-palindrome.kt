class Solution {
    fun isPalindrome(s: String): Boolean {
    
    var low=0
    var str=s.toLowerCase()
    var result=str.replace(Regex("[^A-Za-z0-9]"), "")
    var high = result.length-1 
        
     while(low<high){
         if(result[low]==result[high]){
             low++
             high--
         }
         else
            return false
     }
     return true
    }
}