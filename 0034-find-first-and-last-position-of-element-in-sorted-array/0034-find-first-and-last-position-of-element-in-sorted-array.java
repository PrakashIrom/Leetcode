class Solution {
    public int[] searchRange(int[] nums, int target) {
     int arr[]=new int[2];
    Solution s = new Solution();
    int first=s.OccurF(nums,target);
    int last=s.OccurL(nums,target);
    arr[0]=first;
    arr[1]=last;
    return arr;
    }
    public int OccurF(int arr[],int x)
	{   
      int low = 0, high = arr.length - 1;

		while(low <= high)
		{
			int mid = (low + high) / 2;

			if(x > arr[mid])
				low = mid + 1;

			else if(x < arr[mid])
				high = mid - 1;

			else
			{
				if(mid == 0 || arr[mid] != arr[mid-1])
					return mid;

				else
					high = mid - 1;
			}

		}
	        return -1;
	}
    
    public int OccurL(int arr[],int x)
	{
	        	int low = 0, high = arr.length - 1;

		while(low <= high)
		{
			int mid = (low + high) / 2;

			if(x > arr[mid])
				low = mid + 1;

			else if(x < arr[mid])
				high = mid - 1;

			else
			{
				if(mid == arr.length - 1 || arr[mid + 1] != arr[mid])
					return mid;

				else
					low = mid + 1;
			}

		}
	        return -1;
	}
    
}