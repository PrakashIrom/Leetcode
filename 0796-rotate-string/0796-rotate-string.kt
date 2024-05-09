class Solution {
    fun rotateString(s: String, goal: String): Boolean {
        var result=s+s
        
        if(s.length!=goal.length) return false
        
        if(goal in result) return true
        
        return false
    }
}