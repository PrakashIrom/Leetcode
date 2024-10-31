class Solution {
    fun findMaxAverage(nums: IntArray, k: Int): Double {
        
        var l = 0
        var h = k
        var max = 0.0
        var sum = 0
        
        for(i in 0 until k){
            sum+=nums[i]
        }
        
        max=sum.toDouble()/k
        
        while(h<nums.size){
            sum = sum-nums[l]+nums[h]
            if(max<(sum.toDouble()/k)) max = (sum.toDouble()/k)
            l++
            h++
        }
        
      return max  
    }
}