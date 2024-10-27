class Solution {
    fun gcdOfStrings(str1: String, str2: String): String 
    {
        if( (str1+str2) != (str2+str1)) return ""
        
        val len = findGCD(str1.length, str2.length)
        
        return str1.substring(0,len)
        
    }
    
    fun findGCD(a:Int, b:Int):Int{
        return if(b==0) a else findGCD(b, a%b)
    }
}