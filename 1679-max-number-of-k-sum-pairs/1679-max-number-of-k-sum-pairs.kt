class Solution {
    fun maxOperations(nums: IntArray, k: Int): Int {
        //can use hashmap for efficient solution 

        var l = 0
        var h = nums.size-1
        var count = 0
        nums.sort()
        
        while(l<h)
        {
            if(nums[l]+nums[h]>k) h--
            else if (nums[l]+nums[h]<k)l++
            else
            {
                count++
                l++
                h--
            }
        }
        
        return count
    }
}