class Solution {
    public int searchInsert(int[] nums, int target) {
     int mid=0,left,right,result=0;
        left=0;
        right=nums.length-1;
        while(left<=right){
            mid=(left+right)/2;
            if(nums[mid]==target){
                result=mid;
                break;
            }
            else if(target>nums[mid])
                left=mid+1;
            else
                right=mid-1;
        }
         if(nums[mid]!=target){
             if(target<nums[0])
                    result=0;
            else if(target>nums[nums.length-1])
                    result=nums.length;
            else
             for(int i=0;i<nums.length-1;i++){
                 if(nums[i]<target && target<nums[i+1]){
                     result=i+1;
                     break;
                 }
             }
         }
        return result;
    }
}