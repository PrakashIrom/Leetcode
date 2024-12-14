import kotlin.math.abs

class Solution {
    fun leftRightDifference(nums: IntArray): IntArray {
        
        val result = IntArray(nums.size)
        var rSum = 0
        var lSum = 0
        
        for(i in nums.size-1 downTo 1){
            rSum+=nums[i]
        }
        
        for(i in 0 until nums.size-1){
            
            if(i == 0){
                result[i]=rSum
            }
            else{   
                result[i]=abs(lSum-rSum)
            }
            
            lSum+=nums[i]
            rSum-=nums[i+1]
        }
        
        result[nums.size-1]=lSum
        
        return result
    }
}