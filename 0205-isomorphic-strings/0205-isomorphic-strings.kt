class Solution {
    fun isIsomorphic(s: String, t: String): Boolean {
        var map = HashMap<Char,Char>()
        
        for(i in 0 until s.length){
            if(!map.containsKey(s[i]) && map.containsValue(t[i])) return false
            map[s[i]]=t[i]
        }
        
        for(i in 0 until s.length){
            if(map[s[i]]!=t[i]) return false
        }
        return true
    }
}