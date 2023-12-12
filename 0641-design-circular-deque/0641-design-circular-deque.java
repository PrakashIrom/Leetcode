class MyCircularDeque {
    int arr[];
    int front=-1,rear=-1,len;
    public MyCircularDeque(int k) {
        arr=new int[k];
        len=k;
    }
    
    public boolean insertFront(int value)
    {
           if(front==-1)
           {
               front++;
               rear++;
               arr[front]=value;
           }
            else if((rear+1)%len!=front)
            {
                if(front==0)
                {   
                    front=len-1;
                    arr[front]=value;
                }
                else{
                    front--;
                    arr[front]=value;
                }
               
            }
            else
                return false;
        return true;
    }
    
    public boolean insertLast(int value) {
         if(rear==-1)
           {    
               rear++;
               front++;
               arr[rear]=value;
           }
            else if((rear+1)%len!=front)
            {
                if(rear==len-1)
                {   
                    rear=0;
                    arr[rear]=value;
                }
                else{
                    rear++;
                    arr[rear]=value;
                }
            }
            else
                return false;
        return true;   
    }
    
    public boolean deleteFront()
    {
        if(front==-1)
            return false;
        else{
            if(rear==front)
            {
                rear=-1;
                front=-1;
            }
            else if(front==len-1)
                front=0;
            else
                front++;
        }
        return true;
    }
    
    public boolean deleteLast() {
        if(rear==-1)
            return false;
        else
        {
            if(rear==front)
            {
                rear=-1;
                front=-1;
            }
            else if(rear==0)
                rear=len-1;
            else
                rear--;
        }
        return true;
    }
    
    public int getFront() {
        if(front==-1)
            return -1;
        return arr[front];
    }
    
    public int getRear() {
        if(rear==-1)
            return -1;
        return arr[rear];
    }
    
    public boolean isEmpty() {
     if(front==-1)
         return true;
     return false;
    }
    
    public boolean isFull() {
     if((rear+1)%len==front)
         return true;
    return false;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */