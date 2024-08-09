class Solution {
    fun findDuplicate(nums: IntArray): Int {

        var slow=0
        var fast=0
        
        // proves we have a cycle
        while(true){
            
            fast = nums[nums[fast]]
            slow = nums[slow]
            
            if(slow==fast) break
        }
        
        fast = 0
        
        while(fast!=slow){
            fast=nums[fast]
            slow=nums[slow]
        }
   
      return fast
    }
}