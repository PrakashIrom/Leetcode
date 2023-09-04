import java.util.Scanner;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int b[]=new int[2];
        for(int i=0;i<nums.length-1;i++)
			for(int j=i+1;j<=nums.length-1;j++) {
				if(nums[i]+nums[j]==target) {
					b[0]=i;
					b[1]=j;
					break;
				}
			}
		return b;
    }
}
class Main{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<nums.length;i++)
            nums[i]=s.nextInt();
        int target=s.nextInt();
        Solution sol = new Solution();
        int a[]=sol.twoSum(nums,target);
        System.out.print(a[0]+" "+a[1]);
    }
}