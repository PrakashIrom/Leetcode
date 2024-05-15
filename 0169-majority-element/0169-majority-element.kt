class Solution {
    fun majorityElement(nums: IntArray): Int {
        
        var map = HashMap<Int,Int>()
        val value = nums.size/2
        
        for(i in 0 until nums.size){
            if(map[nums[i]]!=null){
                map[nums[i]] = map[nums[i]]!!+1
            }
            else{
                map[nums[i]]=1
            }
        }
        
        for(i in 0 until nums.size){
           
            if(map[nums[i]]!!.compareTo(value) > 0) return nums[i]
            
        }
        
        return -1
    }
}