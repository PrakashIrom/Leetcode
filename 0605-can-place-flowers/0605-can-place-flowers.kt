class Solution {
    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
        
        var len = n
        var f = intArrayOf(0) + flowerbed + intArrayOf(0) // this is the core logic to solve this problem
        
        for(i in 1 until f.size-1){
            if(f[i-1]==0 && f[i]==0 && f[i+1]==0){
                f[i]=1
                len--
            }
        }
        
        return len<=0
        
    }
}