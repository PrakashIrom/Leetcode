import java.util.ArrayDeque

class Solution {
    fun evalRPN(tokens: Array<String>): Int {
        var stack=ArrayDeque<Int>()
        
        for(i in 0 until tokens.size){
            if(tokens[i]=="+"){
                val result=stack.pop().toInt()+stack.pop().toInt()
                stack.push(result)
            }
            else if(tokens[i]=="-")
            {
                val result=stack.pop().toInt()
                stack.push(stack.pop()-result)
            }
            else if(tokens[i]=="*"){
                 stack.push(stack.pop().toInt()*stack.pop().toInt())
            }
            else if(tokens[i]=="/"){
                val result=stack.pop().toInt()
                stack.push(stack.pop()/result)
            }
            else{
                stack.push(tokens[i].toInt())
            }
        }
        return stack.pop()
    }
}