class Solution {
    fun rotate(nums: IntArray, k: Int): Unit {
        
        val len=nums.size
        var aclen=len-1
        val n = k%len
        val result=Array(len){0}
        var index=0
        // reverse to find the starting element
        // forward to start storing the element to the new array
        //21 12 21 
       // 12 4 21 12 21 12
        
        for(i in 0 until n)
        {
            index=(aclen-i)%len
        }
        
        for(i in 0 until len)
        {
            result[i]=nums[(index+i)%len]
        }
        
        for(i in 0 until len)
        {
            nums[i]=result[i]
        }
     
    }
}