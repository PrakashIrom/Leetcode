class Solution {
    public int[] getConcatenation(int[] nums) {
        int ans[]=new int[2*nums.length];
        int i=0;
        for(i=0;i<nums.length;i++){
         ans[i]=nums[i];   
        }
        for(int j=0;j<nums.length;j++)
            ans[i++]=nums[j];
        return ans;
    }
    
}