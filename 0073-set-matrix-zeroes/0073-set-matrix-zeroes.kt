class Solution {
    fun setZeroes(matrix: Array<IntArray>): Unit {
        var setRow = HashSet<Int>()
        var setCol = HashSet<Int>()
        
        for(i in 0 until matrix.size){
            for(j in 0 until matrix[0].size){
                if(matrix[i][j]==0){
                    setRow.add(i)
                    setCol.add(j)
                }
            }
        }
        
        for(i in 0 until matrix.size){
            for(j in 0 until matrix[0].size){
                if(setRow.contains(i) || setCol.contains(j)){
                    matrix[i][j]=0
                }
            }
        }
        
        
    }
}