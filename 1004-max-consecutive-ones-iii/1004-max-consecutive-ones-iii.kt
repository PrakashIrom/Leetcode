class Solution {
    fun longestOnes(nums: IntArray, k: Int): Int {
        var low = 0
        var count = 0
        var max = 0
        // [1,1,1,0,0,0,0,1,1,1,1,1,1,1] k=3
        //move the high to the right and when it encounters 0s, increment the count until reaches k 
        // when count==k assign count=0 take max=maxOf(max,high-low+1)
        
        for(high in nums.indices){
            if(nums[high]==0) count++
            while(count>k){
                if(nums[low]==0)count--
                low++
            }
            max = maxOf(high-low+1, max)
        }
        return max
    }
}