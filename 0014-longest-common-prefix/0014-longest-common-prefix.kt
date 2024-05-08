class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {

        strs.sort()
        val min = strs[0]
        val max = strs[strs.size-1]
        var n = 0
        
        while(n<min.length && min[n]==max[n]){
            n++
        }
        
       return min.substring(0, n)
    }
}