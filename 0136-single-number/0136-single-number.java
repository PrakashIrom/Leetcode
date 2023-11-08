import java.util.Arrays;
class Solution {
    public int singleNumber(int[] nums) {
    Arrays.sort(nums);
        int value=-1,i;
        //[1,1,2,2,4]
        for( i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                i=i+1;
            }
            else{
                value=nums[i];
                break;   
            }
        }
        if(i==nums.length-1)
            value=nums[nums.length-1];
        return value;
    }
}