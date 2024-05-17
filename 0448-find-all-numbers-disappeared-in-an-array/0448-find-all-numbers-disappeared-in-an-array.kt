class Solution {
    fun findDisappearedNumbers(nums: IntArray): List<Int> {
        
        var arr = IntArray(nums.size+1){0}
        var list = mutableListOf<Int>()
        
        for(i in 0 until nums.size){
            arr[nums[i]] = nums[i]
        }
        
        for(i in 1 until arr.size){
            if(arr[i]==0){
                list.add(i)
                }
            }
        
         return list
        }
    }