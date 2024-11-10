class Solution {
    fun longestOnes(nums: IntArray, k: Int): Int {
        
        var low = 0
        var zerosCount = 0
        var max = 0
        
        // [1,1,1,0,0,0,0,1,1,1,1,1,1,1] k=3
        //move the high to the right and when it encounters 0s, increment the count until reaches k 
        // when count==k assign count=0 take max=maxOf(max,high-low+1)
        //right-low>k
       
        for(curr in nums.indices){
            
            if(nums[curr]==0) zerosCount++
            
            while(zerosCount>k){
                if(nums[low]==0) zerosCount--
                low++
            }
            max = maxOf(max, curr-low+1)
        }
        
        return max
    }
}