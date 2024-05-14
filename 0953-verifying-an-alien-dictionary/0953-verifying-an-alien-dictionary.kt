class Solution {
    fun isAlienSorted(words: Array<String>, order: String): Boolean {
     var map = HashMap<Char?,Int?>()
     var j=0
        
     for(i in 0 until order.length){
         map[order[i]]=i
     }
     
     for(i in 0 until words.size-1){
         
         val w1:String? = words[i]
         val w2:String? = words[i+1]
         
        while(j<w1!!.length && j<w2!!.length){
             
            val v1:Int? = map[w1[j]]
            val v2:Int? = map[w2[j]]
            
            if(v1!=null && v2!=null){
             if(v1<v2){
                 break
             }
             else if(v1==v2){
                 j++
                 if(j==w2!!.length && w1.length>w2!!.length) return false
             }
             else return false
         }
        }
        j=0
     }
     
     return true
    }
}