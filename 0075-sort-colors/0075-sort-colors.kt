class Solution {
    fun sortColors(nums: IntArray): Unit {
        
        var count0=0
        var count1=0
        
        for(i in 0 until nums.size){
            
            if(nums[i]==0) count0++
            else if(nums[i]==1) count1++
            
        }
        
        for(i in 0 until nums.size){
            
            if(count0!=0){
                count0--
                nums[i]=0
            } 
            else if(count1!=0){
                count1--
                nums[i]=1
            }
            else{
                nums[i]=2
            }
            
        }
        
        
    }
}