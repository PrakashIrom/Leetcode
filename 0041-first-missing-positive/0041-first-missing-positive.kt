class Solution {
    fun firstMissingPositive(nums: IntArray): Int {
       
       for(i in 0 until nums.size){
           if(nums[i]<0) nums[i]=0
       }
        
        for(i in 0 until nums.size){
            val value=nums[i].absoluteValue
            if(1<=value && value<=nums.size){
                if(nums[value-1]>0){
                     nums[value-1]=-nums[value-1]
                }
                else if(nums[value-1]==0){
                    nums[value-1]=-(nums.size+1)
                }
            }
        }
        
        for(i in 0 until nums.size){
            if(nums[i]>=0){
                return i+1
            }
        }
        
        return nums.size+1
    }
}