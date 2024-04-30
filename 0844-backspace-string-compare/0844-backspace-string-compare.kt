import java.util.ArrayDeque
class Solution {
    fun backspaceCompare(s: String, t: String): Boolean {
        var stackS=ArrayDeque<Char>()
        var stackT=ArrayDeque<Char>()
        
        for(i in 0 until s.length){
            if(s[i]=='#'){
                if(stackS.isNotEmpty()) stackS.pop()
            }
            else{
                stackS.push(s[i])
            }
        }
        
         for(i in 0 until t.length){
             if(t[i]=='#'){
                if(stackT.isNotEmpty()) stackT.pop()
            }
            else{
                stackT.push(t[i])
            }
        }
         
        if(stackS.size!=stackT.size) return false
        
        while(stackS.isNotEmpty()){
            if(stackS.peek()!=stackT.peek()){
                return false
            }
            stackS.pop()
            stackT.pop()
        }
        return true
    }
}