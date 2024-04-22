class Solution {
    
    fun searchRange(nums: IntArray, target: Int): IntArray {
        val left=binarySearch(nums,target,true)
        val right=binarySearch(nums,target,false)
        val arr:IntArray=IntArray(2)
        
        arr[0]=left
        arr[1]=right
        
        return arr
    }
    
    fun binarySearch(arr: IntArray,target: Int,bias: Boolean): Int{
        var low=0
        var high=arr.size-1
        var i=-1
        
        while(low<=high){
            var mid=(high-low)/2+low
            
            if(arr[mid]==target){
                i=mid
                if(bias){
                    high=mid-1
                }
                else{
                    low=mid+1
                }
            }
            else if(arr[mid]<target){
                low=mid+1
            }
            else{
                high=mid-1
            }
        }
        return i
    }
}