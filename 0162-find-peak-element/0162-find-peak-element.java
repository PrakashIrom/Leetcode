class Solution {
    public int findPeakElement(int[] nums) {
     int low=0,high=nums.length-1;
     if(high==0)
         return 0;
     while(low<=high)
     {
         int mid=(low+(high-low)/2);
         if(mid==0)
         {
             if(nums[mid]>nums[1])
                 return mid;
             else
                 low=mid+1;
         }
         else if(mid==nums.length-1)
         {
             if(nums[mid]>nums[nums.length-2])
                return nums.length-1;
             else
                high=mid-1;
         }
         else
         {
             if(nums[mid-1]<nums[mid] && nums[mid+1]<nums[mid])
                 return mid;
             else if(nums[mid]<nums[mid-1])
                 high=mid-1;
             else
                 low=mid+1;
         }
     }
        return -1;
    }
}