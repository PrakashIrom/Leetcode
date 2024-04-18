class Solution {
    fun rotate(nums: IntArray, k: Int): Unit {
        
        val key=k%nums.size
        
        rotateArray(0,nums.size-1,nums)
        rotateArray(0,key-1,nums)
        rotateArray(key,nums.size-1,nums)
        
    }
    
    fun rotateArray(low:Int,high:Int,arr:IntArray){
        
         var lowIndex = low
         var highIndex = high
        
        while(lowIndex<highIndex){
            val temp:Int=arr[lowIndex]
            arr[lowIndex]=arr[highIndex]
            arr[highIndex]=temp
            lowIndex++
            highIndex--
        }   
    }
}