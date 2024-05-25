class Solution {
    fun addDigits(num: Int): Int {
       
        var sum=0
        var num1=num
        
        while(num1>0){
            
            val rem = num1%10
            sum+=rem
            num1=num1/10
            
            if(num1==0){
                if(sum<10) return sum
               num1=sum
                sum=0
            } 
        }
        return sum
    }
}