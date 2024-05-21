class Solution {
    fun removeDuplicates(nums: IntArray): Int {
     var res=0
     var count=1
        
        for(i in 1 until nums.size){
            if(nums[res]!=nums[i]){
                count=1
                nums[res+1]=nums[i]
                res++
            }
            else{
                count++
                if(count<3){
                    nums[res+1]=nums[i]
                    res++
                }
            }
        }
        return res+1
    }
}