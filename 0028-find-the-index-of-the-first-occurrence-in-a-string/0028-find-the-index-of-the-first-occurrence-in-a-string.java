class Solution {
    public int strStr(String haystack, String needle) {
        int count=0,n=-1;
        for(int i=0;i<=haystack.length()-needle.length();i++){
            n=i;
            for(int j=0;j<needle.length();j++){
                if(haystack.charAt(i+j)==needle.charAt(j))
                    count++;
                }
                if(count==needle.length())
                    break;
                else
                    count=0;       
            }
        if(count!=needle.length())
            n=-1;
        return n;
        }
    }
