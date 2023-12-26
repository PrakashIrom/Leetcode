import java.util.Scanner;
class Solution {
    public int removeDuplicates(int[] nums) {
      int k=1;
    	int tem[]=new int[nums.length];
    	tem[0]=nums[0];
    	for(int i=0;i<nums.length-1;i++) {
    		if(nums[i]<nums[i+1]) {
    			tem[k++]=nums[i+1];
    		}
    	}
        for(int i=0;i<k;i++)
            nums[i]=tem[i];
    return k;
    }
}
