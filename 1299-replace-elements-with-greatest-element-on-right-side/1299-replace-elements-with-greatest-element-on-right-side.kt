class Solution {
    fun replaceElements(arr: IntArray): IntArray {
        
        if(arr.size==1){
            arr[0]=-1
            return arr
        }
        val length=arr.size
        var result=IntArray(length)
        result[length-1]=-1
        result[length-2]=arr[length-1]
        
        for(i in length-3 downTo 0){
            if(arr[i+1]>result[i+1]){
                result[i]=arr[i+1]
            }
            else{
                result[i]=result[i+1]
            }
        }
        return result
    }
}