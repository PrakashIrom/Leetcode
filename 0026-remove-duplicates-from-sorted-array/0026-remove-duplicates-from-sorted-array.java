class Solution {
    public int removeDuplicates(int[] nums) {
        
     LinkedList<Integer> stack=new LinkedList<>();
     stack.push(nums[0]);
        
     if(nums.length==1)
         return 1;
        
        for(int i=1;i<nums.length;i++)
        {
            
            if(stack.peek()!=nums[i])
            {
                stack.push(nums[i]);
                nums[stack.size()-1]=stack.peek();
            }
            
        }
        
        return stack.size();
    }
}
