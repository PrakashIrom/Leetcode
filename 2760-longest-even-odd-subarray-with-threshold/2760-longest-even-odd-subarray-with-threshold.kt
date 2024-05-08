class Solution {
    fun longestAlternatingSubarray(nums: IntArray, threshold: Int): Int {
        
        var rem=-1
        var result=0
        
        for(i in 0 until nums.size){
            
            if(nums[i]%2==0 && nums[i]<=threshold){
                
                for(j in i until nums.size){
                    
                    val value=nums[j]%2
                    
                    if(nums[j]<=threshold && value!=rem){
                        rem=value
                        if(result<j-i+1) result=j-i+1
                    }
                    else{
                        rem=-1
                        break
                    }
                    
                  }
               }
            
            }
        
           return result
        }
}