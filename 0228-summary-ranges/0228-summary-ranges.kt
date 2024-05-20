class Solution {
    fun summaryRanges(nums: IntArray): List<String> {
        
        val list = mutableListOf<String>()
        val c = "->"
        var j = 0
        
        if(nums.size==0) return list
        
        for(i in 1 until nums.size){
            if(nums[i]-nums[i-1]!=1){
                if(j==i-1){
                    list.add(nums[j].toString())
                    j=i
                }
                else{
                    val value = nums[j].toString()+c+nums[i-1].toString()
                    list.add(value)
                    j=i
                }
            }
        }
        
        if(j==nums.size-1){
            list.add(nums[j].toString())
        }
        else{
            val value = nums[j].toString()+c+nums[nums.size-1].toString()
            list.add(value)
        }
        
        return list
    }
}