import java.util.ArrayDeque

class Solution {
    fun removeDuplicates(s: String): String {
        
        val stack=ArrayDeque<Char>()
        val result=StringBuilder()
        var flag=false
        
        stack.push(s[0])
        
        for(i in 1 until s.length){
            if(stack.isNotEmpty() && stack.peek()==s[i]){
                stack.pop()
                continue
            }
            stack.push(s[i])
        }
        
        repeat(stack.size){
            result.append(stack.pop())
        }
        return result.reverse().toString()
    }
}