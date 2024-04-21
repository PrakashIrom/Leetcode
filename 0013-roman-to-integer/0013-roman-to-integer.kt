class Solution {
    fun romanToInt(s: String): Int {
    // logic-> start from reverse and if s[i-1]<s[i] then s[i]-s[i-1] else take the exact value
        var map: HashMap<Char, Int> = HashMap<Char,Int>()
        var result=0
        var i=s.length-1
        map['I']=1
        map['V']=5
        map['X']=10
        map['L']=50
        map['C']=100
        map['D']=500
        map['M']=1000
        
    
       while(i>0){
           val curr=map[s[i]]!!
           val prev=map[s[i-1]]!!
           
            if(prev<curr){
                result=result+curr!!-prev!!
                i--
            }
            else{
                result=result+curr!!
        }
            if(i==0){
                return result
            }
        i--
    }
        return result+map[s[0]]!!
}
}
