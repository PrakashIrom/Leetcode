class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        // use hashset
        // store the length of hashset
        // use window sliding technique to traverse
        
        var length=0
        
        for(i in 0 until s.length){
            var j=i
            val hashSet=HashSet<Char>()
            
            while(j<s.length){
                if(hashSet.add(s[j])==false){
                    length=max(hashSet.size,length)
                    hashSet.remove(s[i])
                    break
                }
                j++
            }
            
            if(j==s.length) return max(hashSet.size,length)
            
           
        }
        return length
    }
}