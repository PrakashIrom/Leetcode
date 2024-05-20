class Solution {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        var map = HashMap<Char,Int>()
        
        for(i in 0 until magazine.length){
            if (map.containsKey(magazine[i])) {
                map[magazine[i]] = map[magazine[i]]?.plus(1) ?: 1 // Use plus or elvis operator
            } 
            else {
                map[magazine[i]] = 1
            }
        }
        
        for(i in 0 until ransomNote.length){
            
            if(!map.containsKey(ransomNote[i])) return false
            else{
                
                map[ransomNote[i]] = map[ransomNote[i]]!! - 1
                
                if(map[ransomNote[i]]==0){
                    map.remove(ransomNote[i])
                }
            }
        }
        
        return true
    }
}