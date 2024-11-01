class Solution {
    fun uniqueOccurrences(arr: IntArray): Boolean {
        
        val map: MutableMap<Int, Int> = mutableMapOf()
        val occurence = mutableSetOf<Int>()
        
        for(i in arr)
        {
            if(map[i]==null) map[i]=1
            else map[i]=map[i]!!+1
        }
        
        for(count in map.values){
            if(!occurence.add(count)){
                return false
            }
        }
        
        
        return true
    }
}