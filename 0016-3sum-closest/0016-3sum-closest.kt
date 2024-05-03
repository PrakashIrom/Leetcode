class Solution {
    fun threeSumClosest(nums: IntArray, target: Int): Int {
        //(target-nums[i]-nums[low]-nums[high]).toAbsoluteValue
        //nums.sort
        nums.sort()
        var result=nums[0]+nums[1]+nums[2]
        
        
        for(i in 0 until nums.size-2){
            
            var left=i+1
            var right=nums.size-1
            
            while(left<right){
               val sum = nums[i]+nums[left]+nums[right]
                if((sum-target).absoluteValue<(result-target).absoluteValue)
                {
                    result=sum
                }
                else if(sum<target)
                {
                    left++
                }
                else{
                    right--
                }
            }
        }
        return result
    }
}