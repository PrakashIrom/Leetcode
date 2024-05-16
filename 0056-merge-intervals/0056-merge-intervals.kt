class Solution {
    fun merge(intervals: Array<IntArray>): Array<IntArray> {
        
        var sorted_arr = intervals.sortedBy{ it[0] }
        var list = mutableListOf<IntArray>()
        list.add(sorted_arr[0])
        var index=0
        
        for(j in 1 until intervals.size){
            if(list[index][1] >= sorted_arr[j][0]){
                list[index][1] = max(sorted_arr[j][1],list[index][1])
            }
            else{
                list.add(sorted_arr[j])
                index++
            }
        }

        
       return list.toTypedArray()
    }
}