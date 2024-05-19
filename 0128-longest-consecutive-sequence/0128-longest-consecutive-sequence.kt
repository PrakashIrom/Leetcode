class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        var set = HashSet<Int>()
        var count=1
        var max=0
        
        for(i in 0 until nums.size){
            set.add(nums[i])
        }
        
        for(i in 0 until nums.size){
            if(!set.contains(nums[i]-1)){
                var value=nums[i]
                while(set.contains(value+1)){
                    value=value+1
                    count++
                }
            }
            if(max<count) max=count
            
            count=1
        }
        return max
    }
}