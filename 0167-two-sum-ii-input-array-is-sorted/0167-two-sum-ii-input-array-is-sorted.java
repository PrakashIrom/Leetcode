class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int low=0,high=numbers.length-1;
        
        while(low<high)
        {
            if(target==numbers[low]+numbers[high])
            {
               return new int[] {low+1,high+1};
            }
            else if(target<numbers[low]+numbers[high])
                high--;
            else
                low++;
        }
        return new int[] {low+1,high+1};
    }
}