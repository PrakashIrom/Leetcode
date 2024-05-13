class Solution {
    fun calculate(s: String): Int {
        var i = 0
        var prev=0
        var curr=0
        var cur_op='+'
        var res=0
        
        while(i<s.length){
            
            if(s[i].isDigit()){
                
                while(i<s.length && s[i].isDigit()){
                    curr = curr*10+s[i].toInt()- '0'.toInt()
                    i++
                }
                i--
                if(cur_op=='+'){
                    res += curr
                    prev = curr
                }
                else if(cur_op=='-'){
                    res -= curr
                    prev =- curr
                }
                else if(cur_op=='*'){
                    res -= prev
                    res += (curr*prev)
                    prev = curr*prev
                }
                else if(cur_op=='/'){
                    res -= prev
                    res += (prev/curr)
                    prev = prev/curr
                }
                curr=0
            }
            else if(s[i]!=' ') cur_op=s[i]
            i++
        }
        return res
    }
}