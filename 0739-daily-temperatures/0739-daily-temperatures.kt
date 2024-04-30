import java.util.ArrayDeque

class Solution {
    fun dailyTemperatures(temperatures: IntArray): IntArray {
        
        var res=IntArray(temperatures.size)
        val stack=ArrayDeque<Int>()
        val count=ArrayDeque<Int>()
        
        for(i in temperatures.size-1 downTo 0 ){
            
            if(stack.isEmpty()){
                stack.push(temperatures[i])
                count.push(0)
            }
            else{
                
                if(stack.peek()>temperatures[i]){
                    count.push(1)
                    stack.push(temperatures[i])
                }
                else{
                    var sum=1
                    while(stack.isNotEmpty() && stack.peek()<=temperatures[i]){
                        stack.pop()
                        sum+=count.pop()
                    }
                    if(stack.isEmpty()){
                        count.push(0)
                    }else{
                        count.push(sum)
                    }
                    stack.push(temperatures[i])
                }
                
            }
            res[i]=count.peek()
        }
        return res
    }
}