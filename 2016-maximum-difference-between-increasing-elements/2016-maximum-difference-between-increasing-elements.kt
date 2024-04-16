class Solution {
    fun maximumDifference(nums: IntArray): Int {
        val length=nums.size
        var result=-1
        var min=nums[0]
        
        for(i in 1 until length){
           
            if(result<nums[i]-min && nums[i]>min){
               result=nums[i]-min
           }
            
            if(min>nums[i])
            {
                min=nums[i]
            }
           
        }
        return result
    }
}