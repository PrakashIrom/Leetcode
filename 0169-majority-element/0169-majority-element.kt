class Solution {
    fun majorityElement(nums: IntArray): Int {
        
        var map = HashMap<Int,Int>()
        val value = nums.size/2
        
        if(nums.size==1) return nums[0]
        
       for(i in 0 until nums.size){
        if(map.containsKey(nums[i])){
            map[nums[i]]=map[nums[i]]!!+1
            if(map[nums[i]]!!>value){
                //print(nums[i])
                return nums[i]
            }
        }
        else{
            map[nums[i]]=1
        }
    } 
        
        return -1
    }
}