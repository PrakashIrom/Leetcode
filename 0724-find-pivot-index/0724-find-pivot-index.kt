class Solution {
    fun pivotIndex(nums: IntArray): Int {
        
        var lsum = 0
        var rsum = 0
        
        for(i in 0 until nums.size-1){
            lsum+=nums[i]
        }
        
        if(lsum-nums[nums.size-1] == 0) return nums.size-1
        
        lsum = lsum-nums[nums.size-1]
        
        for(i in nums.size-1 downTo 2){
            
            rsum+=nums[i]
            lsum-=nums[i-1]    
            
            if(rsum == lsum ) return i-1
        }
        
        if(rsum+nums[1]==0) return 0
            
        return -1
        
    }
}