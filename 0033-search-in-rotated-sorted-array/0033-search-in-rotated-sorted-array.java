class Solution
{
    public int search(int[] nums, int target) {
        
     int low=0,high=nums.length-1;
        
     while(low<=high)
     {
      int mid=(low+(high-low)/2);
         
      if(nums[mid]==target)
          return mid;
      else if(nums[low]<=nums[mid])//check whether first half of the array is sorted or not 
      {
         if(nums[low]<=target && target<nums[mid])//checking whether the target is in the first sorted half or not
             high=mid-1;
          else
              low=mid+1;//low is set to mid+1 to shift to second unsorted since the target might present in there
      }
        else//if comes to else part means that the second half of the array is a sorted one
        { 
            if(nums[mid]<target && target<=nums[high])//checking whether the target is in the second sorted half or not
             low=mid+1;
            else
              high=mid-1;//high is set to mid-1 since the target is not there in the second sorted half
        }
     } 
        return -1;
    }
}