class Solution {
    fun mySqrt(x: Int): Int {
        var low=1
        var high=x
        var res=0
        
        while(low<=high){
            val mid=low+(high-low)/2
            println(mid)
            val sq=mid.toLong()*mid.toLong()
            
           if(sq<x){
                res=mid
                low=mid+1
            }
            else if(x<sq){
                high=mid-1
            }
            else return mid
        }
        return res
    }
}