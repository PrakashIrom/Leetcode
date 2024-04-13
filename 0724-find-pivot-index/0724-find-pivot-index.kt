class Solution {
    fun pivotIndex(nums: IntArray): Int {
        
        var sum1=0
        val length=nums.size
        var sum2=0
        
        for(i in length-1 downTo 0){
            sum1=nums[i]+sum1
        }
        
        for(i in 0 until length){
           sum1-=nums[i]
            
            if(sum1==0 && i==0){
                return 0
            }
            else if(sum2==0 && i==length-1){
                return length-1
            }
            else if (sum1==sum2){
                return i
            }
            else{
                sum2+=nums[i]
            }
        }
        return -1
    }
}