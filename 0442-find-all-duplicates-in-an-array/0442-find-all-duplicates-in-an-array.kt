class Solution {
    fun findDuplicates(nums: IntArray): List<Int> {
        
        val list = mutableListOf<Int>()
        val set = HashSet<Int>(nums.size)
        
        for(i in 0 until nums.size){
            if(set.add(nums[i])==false){
                list.add(nums[i])
            }
        }
        
        return list
        
    }
}