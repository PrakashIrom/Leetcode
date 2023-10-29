class Solution {
    public int[] plusOne(int[] digits) {
        int p,n,k,result=0;
        p=digits.length-1;
         int arr[];
       if(digits[p]==9){
           while(digits[p]==9 && p!=0){
             digits[p--]=0;
           }
           if(p==0 && digits[p]==9){
             arr=new int[digits.length+1];
             arr[0]=1;
             for(int i=1;i<arr.length;i++)
                arr[i]=0;
           }
           else{
               arr=new int[digits.length];
               digits[p]=digits[p]+1;
               for(int i=0;i<digits.length;i++)
                arr[i]=digits[i];
           }
       }
       else{
        arr=new int[digits.length];
        digits[p]=digits[p]+1;
        for(int i=0;i<arr.length;i++)
            arr[i]=digits[i];
       }
        return arr;
    }
}