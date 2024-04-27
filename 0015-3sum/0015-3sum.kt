class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        
        nums.sort()
        val list=mutableListOf<List<Int>>()
        
        for(i in 0 until nums.size-2){
            
            var low=i+1
            var high=nums.size-1
            
            while(low<high){
                
                if(nums[i]+nums[low]+nums[high]>0){
                    high--
                }
                else if(nums[i]+nums[low]+nums[high]<0){
                    low++
                }
                else{
                    val resList=listOf(nums[i],nums[low],nums[high])
                    if(!list.contains(resList)){
                        list.add(resList)
                    }
                    else{
                        high--
                    }
                }
            }
        }
         return list
    }
}