class Solution {
    fun removeStars(s: String): String {
        
        val stack:MutableList<Char> = mutableListOf()
        var l = 0
        
        if(s.length==1)
        {
            if(s[0]=='*') return ""
            else return s
        }
        
        while(l<s.length){
            if(stack.isEmpty()) stack.add(s[l])
            else if(s[l]=='*') stack.removeLast()
            else stack.add(s[l])
            l++
        }
        
        return stack.joinToString("")
        
    }
}