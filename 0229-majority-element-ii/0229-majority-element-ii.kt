class Solution {
    fun majorityElement(nums: IntArray): List<Int> {
        
        var map = HashMap<Int,Int>()
        val value = nums.size/3
        var list = mutableListOf<Int>()
        
        for(i in 0 until nums.size){
            if(map[nums[i]]!=null){
                map[nums[i]] = map[nums[i]]!!+1
            }
            else{
                map[nums[i]]=1
            }
        }
        
         for(i in 0 until nums.size){
           
             if(map.contains(nums[i])){
                if(map[nums[i]]!!.compareTo(value) > 0){
              
                    list.add(nums[i])
                    map.remove(nums[i])
                } 
                
             }
        }
         
         return list
    }
}