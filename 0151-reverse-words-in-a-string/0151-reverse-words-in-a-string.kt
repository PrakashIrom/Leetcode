class Solution {
    fun reverseWords(s: String): String {
    
        var result=s.trim()
        var copy:String = " "
        copy=copy+result
        var copy1=""
        result=""
        var flag=false
        
        for(i in copy.length-1 downTo 0){
            if(copy[i]!=' '){
                copy1=copy1+copy[i]
                flag=true
            }
            else if(flag){
                copy1 = StringBuilder(copy1).reverse().toString()
                result=result+copy1+" "
                flag=false
                copy1=""
            }
        }
        
       return result.trim() 
    }
}