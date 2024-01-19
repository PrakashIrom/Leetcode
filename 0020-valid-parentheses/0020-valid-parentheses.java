class Solution {

    public boolean isValid(String s) {
        
	Deque<Character> stack = new LinkedList<>();
    
    if(s.length()==1)
        return false;
    else
    {
        
        for(int i=0;i<s.length();i++)
        {
            
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{')
                stack.push(s.charAt(i));  
            else
            {
                
                if(!stack.isEmpty())
                {
                    if(s.charAt(i)==']' && stack.peek()=='[')
                        stack.pop();
                    else if(s.charAt(i)==')' && stack.peek()=='(')
                        stack.pop();
                    else if(s.charAt(i)=='}' && stack.peek()=='{')
                        stack.pop();
                    else
                        return false;
                }
                else
                    return false;
            
            }
    }
        
    if(!stack.isEmpty())
        return false;
        
    return true;    
  }
}
}
