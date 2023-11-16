import java.util.Arrays;
class Solution {
    public int maxSubArray(int[] nums) {
        int[] maxEnding=new int[nums.length];
        maxEnding[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            if(maxEnding[i-1]+nums[i]>nums[i])
                maxEnding[i]=maxEnding[i-1]+nums[i];
            else
                maxEnding[i]=nums[i];
        }
        int large=maxEnding[0];
        for(int i=0;i<nums.length-1;i++){
            if(large<maxEnding[i+1])
                large=maxEnding[i+1];
        }
        return large;
    }
}