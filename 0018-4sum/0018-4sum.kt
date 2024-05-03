class Solution {
    fun fourSum(nums: IntArray, target: Int): List<List<Int>> {
        
        val result = mutableSetOf<List<Int>>()
        
        nums.sort()
        
        for(i in 0 until nums.size-3){
            
            for(j in i+1 until nums.size-2){
                
                var low=j+1
                var high=nums.size-1

                while(low<high){
                    
                     val sum: Long = nums[i].toLong() + nums[j].toLong() + nums[low].toLong() + nums[high].toLong()

                    
                    if(sum==target.toLong()){
                        result.add(listOf(nums[i],nums[j],nums[low],nums[high]))
                        low++
                    }
                    else if(sum<target){
                        low++
                    }
                    else{
                        high--
                    }
                }
            }
            
        }
        return result.toList()
    }
}