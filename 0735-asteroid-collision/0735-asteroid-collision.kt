import kotlin.math.abs

class Solution {
    fun asteroidCollision(asteroids: IntArray): IntArray {
        
        val stack:MutableList<Int> = mutableListOf()
        
        for(arr in asteroids){
            
            var explode = false
           
            while(stack.isNotEmpty() && stack.last()>0 && arr<0){
                if(stack.last()<-arr){
                    stack.removeAt(stack.size-1)
                }
                else if (stack.last()==-arr){
                    stack.removeAt(stack.size-1)
                    explode = true
                    break
                }
                else{
                    explode = true
                    break
                }
            }
            
            
            if(!explode) stack.add(arr)
        }
        
        return stack.toIntArray()
    }
}