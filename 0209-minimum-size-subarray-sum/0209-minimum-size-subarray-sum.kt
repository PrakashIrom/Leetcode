class Solution {
    fun minSubArrayLen(target: Int, nums: IntArray): Int {
     // have to check for nums[i]==target first if not
     // then have to check for sum start adding to a list
    // length=right-left+1
        
        var res=Int.MAX_VALUE
        var sum=0
        var l=0
        
        for(i in 0 until nums.size)
        {
            sum+=nums[i]
            
            while(sum>=target){
                res=min(res,i-l+1)
                sum-=nums[l]
                l++
            }
            
            
        }
        
        if(res==Int.MAX_VALUE) return 0 else return res
    }
}