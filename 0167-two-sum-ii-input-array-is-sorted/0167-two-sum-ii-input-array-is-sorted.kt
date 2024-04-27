class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        
        var arr=IntArray(2){-1}
        var low=0
        var high=numbers.size-1
        
        while(low<high){
            if(numbers[low]+numbers[high]>target) high--
            else if(numbers[low]+numbers[high]<target) low++
            else{
                arr[0]=low+1
                arr[1]=high+1
                return arr
            }
        }
        return arr
    }
}
