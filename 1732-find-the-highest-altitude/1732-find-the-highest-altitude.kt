class Solution {
    fun largestAltitude(gain: IntArray): Int {
        
        var alt = 0
        var sum = gain[0]
        
        for(i in 1 until gain.size){
            if(alt<sum) alt = sum
            sum+=gain[i]
             print("$sum ")
        }
        
        if(sum>alt) alt=sum
        
        return alt
    }
}