import java.util.ArrayDeque

class Solution {
    fun removeDuplicates(s: String, k: Int): String {
     
     val stack=ArrayDeque<Char>()
     val count=ArrayDeque<Int>()
     val result=StringBuilder()
     
     for(i in 0 until s.length){
         if(stack.isEmpty()){
             stack.push(s[i])
             count.push(1)
         }
         else{
             if(stack.peek()==s[i]){
                 count.push(count.peek()+1)
             }
             else{
             count.push(1)
             }
             stack.push(s[i])
         }
         
         if(count.peek()==k){
             repeat(k){
                 stack.pop()
                 count.pop()
             }
         }
     }
     
     repeat(stack.size){
         result.append(stack.pop())
     }
     
     return result.reverse().toString()
    }
}