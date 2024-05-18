class Solution {
    fun spiralOrder(matrix: Array<IntArray>): List<Int> {
        
        // first row -> last column -> last row -> first column 
        // and move inwards
        
        var list = mutableListOf<Int>()
        var topRow=0
        var lastRow=matrix.size-1
        var rightCol=matrix[0].size-1
        var leftCol=0
        
        while(topRow<=lastRow && leftCol<=rightCol){
            
            // top row
            for(i in leftCol..rightCol){
                list.add(matrix[topRow][i])
            }
            topRow++
            
            // right column
            for(i in topRow..lastRow){
                list.add(matrix[i][rightCol])
            }
            rightCol--
            
            // last row
            if(topRow<=lastRow){
            for(i in rightCol downTo leftCol){
                list.add(matrix[lastRow][i])
            }
            lastRow--
            }
            
            // left column
            if(leftCol<=rightCol){
            for(i in lastRow downTo topRow){
                list.add(matrix[i][leftCol])
            }
            leftCol++
            }
            
            
        }
        
        return list
    }
}