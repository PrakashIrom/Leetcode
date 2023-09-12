class Solution {
    public int removeElement(int[] nums, int val) {
        int count=0,j=0;
        int tem[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                count++;
                tem[j++]=nums[i];
            }
        }
        for(int i=0;i<j;i++)
            nums[i]=tem[i];
        return count;
    }
}