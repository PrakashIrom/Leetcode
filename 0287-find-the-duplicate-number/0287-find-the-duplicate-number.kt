class Solution {
    fun findDuplicate(nums: IntArray): Int {
      var set = HashSet<Int>()
      
      for(i in 0 until nums.size){
          if(set.add(nums[i])==false) return nums[i]
      }
      
      return 0
    }
}