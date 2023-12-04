class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Deque<Integer> ticket = new ArrayDeque<>();
        for(int i=0;i<tickets.length;i++)
            ticket.offer(tickets[i]);
        int index=k,time=0;
        while(tickets[k]!=0){
            int value=ticket.peek()-1;
            ticket.poll();
            if(value!=0)
                ticket.addLast(value);
            if(index!=0)
                index--;
            else{
                tickets[k]=tickets[k]-1;
                index=ticket.size()-1;
            }
            time++;
        }
        return time;
    }
}