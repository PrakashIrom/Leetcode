class Solution {
    fun subarraySum(nums: IntArray, k: Int): Int {
        // prefix sum
        
        val map = mutableMapOf<Int,Int>()
        var sum=0
        var count=0
        
        for(i in 0 until nums.size){
            sum+=nums[i]
            
            if(sum==k) count++
            
            if(map.containsKey(sum-k)){
              count=map[sum-k]!!+count // coz sum-k might occur multiple times in the map  
            }  
            
            if(map.containsKey(sum)){
                map[sum] = map[sum]!!+1 // because of -1 and 0 the sum might already be there in the map
            }
            else{
                map[sum]=1
            }
            
        }
        
        return count
    }
}