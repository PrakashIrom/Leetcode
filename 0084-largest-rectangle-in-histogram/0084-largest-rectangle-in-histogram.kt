import java.util.ArrayDeque

class Solution {
    fun largestRectangleArea(heights: IntArray): Int {
        // have to traverse to left and right until we find the bar whose 
        // height is less than the current height and calculate the area
        
        var left=IntArray(heights.size)
        var right=IntArray(heights.size)
        val lstack=ArrayDeque<Int>()
        val rstack=ArrayDeque<Int>()
        var area=0
        
        for(i in 0 until heights.size){
            
            while(lstack.isNotEmpty() && heights[i]<=heights[lstack.peek()]){
                lstack.pop()
            }
            
            if(lstack.isEmpty()){
                left[i]=0
                
            }else{
                left[i]=lstack.peek()+1
            }
            lstack.push(i) 
        }
        
         for(i in heights.size-1 downTo 0){
            
            while(rstack.isNotEmpty() && heights[i]<=heights[rstack.peek()]){
                rstack.pop()
            }
            
            if(rstack.isEmpty()){
                right[i]=heights.size-1
                
            }else{
                right[i]=rstack.peek()-1
            }
            rstack.push(i)
            if(area<(right[i]-left[i]+1)*heights[i]){
                area=(right[i]-left[i]+1)*heights[i]
            }
        }
        
        
        return area
    }
}