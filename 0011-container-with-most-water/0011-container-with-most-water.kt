class Solution {
    fun maxArea(height: IntArray): Int {
        var area=0
        var low=0
        var result=0
        var high=height.size-1
        
       while(low<=high){
           if(height[low]>height[high])
           {
                area=(high-low)*height[high]
               high--
           }
           else{
               area=(high-low)*height[low]
               low++
           }
           
           if(area>result){
               result=area
           }
       }
       return result
    }
}