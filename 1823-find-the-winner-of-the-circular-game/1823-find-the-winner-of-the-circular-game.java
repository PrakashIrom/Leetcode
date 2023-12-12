class Solution {
    public int findTheWinner(int n, int k) {
     //the last item that survived is the output
        int out=1;
        Deque<Integer> queue=new LinkedList<>();
        for(int i=1;i<=n;i++)
        {
            queue.offer(i);
        }
        while(queue.size()!=1)
        {
         if(out!=k)
         {
             queue.addLast(queue.peek());
             queue.poll();
             out++;
         }
          else
          {
              out=1;
              queue.poll();
          }
        }
        return queue.peek();
    }
}