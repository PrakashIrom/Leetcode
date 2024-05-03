class Solution {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        
        val hashset=HashSet<Int>()
        var left=0
        
       for(right in 0 until nums.size){
           
           if(right-left>k){
               hashset.remove(nums[left])
               left++
           }
           
           if(!hashset.add(nums[right])){
               return true
           }
           
       }
       
       return false
    }
}