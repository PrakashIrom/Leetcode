class Solution {
    fun longestSubarray(nums: IntArray): Int {
        
        var max = 0
        var low = 0
        var count = 0
        //[1,0,1,0,0,0,1,1,1,1,0,1]
        
        for(high in nums.indices){
            
            if(nums[high]==0) count++
            
            while(count>1){
                if(nums[low]==0) count--
              low++  
            } 
            
            max = maxOf(high-low, max)
        }
        
        return max
    }
}