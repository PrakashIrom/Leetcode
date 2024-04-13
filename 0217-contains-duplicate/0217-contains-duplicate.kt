class Solution {
    fun containsDuplicate(nums: IntArray): Boolean
    {
           val hashSet=HashSet<Int>()
           
           for(i in 0 until nums.size){
               if(hashSet.add(nums[i])==false)
                return true
           }
           
           return false
    }
}