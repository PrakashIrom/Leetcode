class Solution {
    fun findRotation(mat: Array<IntArray>, target: Array<IntArray>): Boolean {
        
        var n=1
        var res = mat
        
        if(target.contentDeepEquals(mat)) return true
        else if (mat.size==1){
            if(mat[0][0]==target[0][0]) return true
        }
        
        while(n<=mat.size*mat.size-1){
            
             val copy = Array(mat.size){IntArray(mat.size)}
             
            for(i in 0 until mat.size){
                for(j in 0 until mat[0].size){
                    copy[j][mat.size-1-i] = res[i][j]
                }
            }
            
            if(target.contentDeepEquals(copy)) return true
            res=copy
            n++
        }
        
        return false
    }
}