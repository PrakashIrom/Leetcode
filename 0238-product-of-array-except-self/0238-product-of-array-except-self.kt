class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        //prefix [1,2,6,24] multiplying every elements from the left index until the currrent index
        //postfix [24,24,12,4] multiplying every elements from the right index until the current index
        // result[24,12,8,6] the result is achieved by multiplying the prefix and postfix element of the current             // index

        val length=nums.size
        var pfix=1
        var result=IntArray(length){0}
        
        for(i in 0 until length){
            if(i==0){
                result[i]=1
                pfix=pfix*nums[i]
            }
            else{
                result[i]=pfix
                pfix=nums[i]*pfix
            }
          
        }
        
        pfix=1
        
        for(i in length-1 downTo 0){
            if(i==length-1){
                result[i]=result[i]
                pfix=nums[i]
            }
            else if(i==0){
                result[i]=pfix
            }
            else{
                result[i]=result[i]*pfix
                pfix=pfix*nums[i]
            }
        }
        return result
    }
}