import java.util.Scanner;
class Solution {
    public int removeDuplicates(int[] nums) {
     LinkedList<Integer> stack=new LinkedList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(stack.isEmpty())
                stack.push(nums[i]);
            else if(!stack.isEmpty() && stack.peek()!=nums[i])
            {
                stack.push(nums[i]);    
                nums[stack.size()-1]=stack.peek();
            }
        }
        return stack.size();
    }
}
