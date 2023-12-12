class Solution {
    public String removeOuterParentheses(String s) {
        Deque<Character> stack = new LinkedList<>();
        String copy= new String();
        for(int i=0;i<s.length();i++)
        {
            if(stack.isEmpty())
                stack.push(s.charAt(i));
            else if(stack.size()==1 && s.charAt(i)==')')
                                stack.pop();
            else
            {
                if(s.charAt(i)==')')
                {
                    stack.pop();
                    copy = copy + s.charAt(i);
                }
                else
                {
                    stack.push('(');
                    copy = copy + s.charAt(i);
                 }
            }
        }
        return copy;
    }
}