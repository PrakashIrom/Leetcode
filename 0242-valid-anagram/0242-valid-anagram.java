class Solution {
    
    public boolean isAnagram(String s, String t) {
    
        int counts[]=new int[26];
        int countt[]=new int[26];
        int count=0;
        
        if(s.length()!=t.length())
            return false;
        
        for(int i=0;i<s.length();i++)
        {    
            counts[s.charAt(i)-'a']++;
            countt[t.charAt(i)-'a']++;   
        }
        
        for(count=0;count<counts.length;count++)
        {
            if(counts[count]==countt[count])
                continue;
            else
                return false;
        }
        
        return true;
    }
}