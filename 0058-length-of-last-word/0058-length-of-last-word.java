class Solution {
    public int lengthOfLastWord(String s) {
     //have to return an integer
    //should return the length of the last word without space
    //string consist only letters and space
        String s1=s.trim();
        int count=0;
        for(int i=s1.length()-1;i>=0;i--){
            if(s1.charAt(i)!=' ')
                count++;
            else
                break;
        }
         return count;   
        }   
    }
