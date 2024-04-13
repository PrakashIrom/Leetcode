class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        var count=0
        val length=nums.size
        
        for(i in 0 until length){
            if(nums[i]==0){
                count++
            }
            else{
                val index= i-count
                val tem=nums[index]
                nums[index]=nums[i]
                nums[i]=tem
            }
        }
        
    }
}
       
