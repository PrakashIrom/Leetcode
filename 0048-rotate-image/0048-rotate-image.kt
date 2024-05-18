class Solution {
    fun rotate(matrix: Array<IntArray>): Unit {
        
        for(i in 0 until matrix.size){
            for(j in i until matrix.size){
                val tem = matrix[i][j]
                matrix[i][j] = matrix[j][i]
                matrix[j][i] = tem
            }
        }
        
        var l=0
        var r=matrix.size-1
        
        for(i in 0 until matrix.size){
            
            while(l<r){
               val tem = matrix[i][l]
                matrix[i][l] = matrix[i][r]
                matrix[i][r] = tem
                l++
                r--
            }
            
            l=0
            r=matrix.size-1
        }
        
        
    }
}