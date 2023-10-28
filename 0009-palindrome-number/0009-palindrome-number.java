class Solution {
    public boolean isPalindrome(int x) {
       //check for palindrome number
       //negative value can also be input
       //if palindrome then return true else false
       String s = String.valueOf(x);
       int n=s.length();
       int k=n-1,i=0;
       boolean value=true;
       for(i=0;i<=n/2-1;i++){
           if(s.charAt(i)==s.charAt(k)){
               k--;
               continue;
           }
           else
                break;
       } 
      if(i==n/2)
        value=true;
      else
        value=false;
    return value;
    }
}