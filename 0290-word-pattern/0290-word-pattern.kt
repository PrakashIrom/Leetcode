class Solution {
    fun wordPattern(pattern: String, s: String): Boolean {
       
        var map = HashMap<Char,String>()
        val word:Array<String> = s.split(" ").toTypedArray()
        var n=0
        
        if(word.size>pattern.length || (pattern.length==s.length && pattern.length!=1 && pattern.length!=1)) return false
        
        if(pattern.length>word.size) return false
        
        for(i in 0 until word.size){
            if(map.containsValue(word[i]) && !map.containsKey(pattern[n])) return false
            else if(map.containsKey(pattern[n]) && map[pattern[n]]!=word[i]) return false
            else{
                map[pattern[n]]=word[i]
                n++
            }
        }
      
        
       return true
    }
}