class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
       
    val map = mutableMapOf<String,List<String>>()
        
        for(str in strs){
            
            var count=IntArray(26)
            
            for(c in str){
                count[c - 'a']++
            }
            
            val key = count.joinToString(",")
            
            if (map.containsKey(key)) 
            {
             (map[key] as MutableList<String>).add(str)
            } 
            else 
            {
            map.put(key, mutableListOf(str))
            }
        }
        return map.values.toList()
    }
}