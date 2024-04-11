class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var res=0
        val length=nums.size
        for(i in 1 until length){
            if(nums[i]!=nums[res]){
                nums[res+1]=nums[i]
                res++
            }
        }
        return res+1
    }
}