class Solution {
    fun missingNumber(nums: IntArray): Int {
        
        val j=nums.size*(nums.size+1)/2
        var sum=0
        
        for(i in 0 until nums.size){
            sum+=nums[i]
        }
        return j-sum
    }
}