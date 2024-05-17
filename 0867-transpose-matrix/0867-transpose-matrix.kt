class Solution {
    fun transpose(matrix: Array<IntArray>): Array<IntArray> {
        val m = matrix.size
        val n = matrix[0].size
        var arr = Array(n){IntArray(m)}
        
        for(i in 0 until m){
            for( j in 0 until n){
                arr[j][i] = matrix[i][j]
            }
        }
        
        return arr
    }
}