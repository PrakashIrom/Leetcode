class Solution {
    public int[] nextGreaterElements(int[] nums)
    {
        int res[]=new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length;i++){
            for(j=0;j<nums.length;j++){
                if(nums[i]<nums[(i+j)%nums.length])
                {
                    res[i]=nums[(j+i)%nums.length];
                    break;
                }
            }
            if(j==nums.length)
            {
                res[i]=-1;
            }
        }
        return res;
    }
}