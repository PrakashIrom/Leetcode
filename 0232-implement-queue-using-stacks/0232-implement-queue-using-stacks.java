class MyQueue {
    Deque<Integer> stack1 = new LinkedList<>();
    Deque<Integer> stack2 = new LinkedList<>();    
    public MyQueue() {
        
    }
    
    public void push(int x) {
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
       stack1.push(x); 
    }
    public int pop() {
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        if(!stack2.isEmpty())
            return stack2.pop();
        return -1;
    }
    
    public int peek() {
        if(stack2.isEmpty()==false)
            return stack2.peek();
        else if(stack2.isEmpty()){
            while(!stack1.isEmpty())
                stack2.push(stack1.pop());
            return stack2.peek();
        }
        return -1;
    }
    
    public boolean empty() {
        if(!stack1.isEmpty() || !stack2.isEmpty())
            return false;
        return true;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */