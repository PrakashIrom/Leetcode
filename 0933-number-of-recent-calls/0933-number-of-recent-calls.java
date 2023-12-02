import java.util.LinkedList;
import java.util.Queue;
class RecentCounter {
            
    Queue<Integer> queue;
    
    public RecentCounter() {
        queue= new LinkedList<>();
        
    }
    
    public int ping(int t) {
        int range=t-3000;
        queue.offer(t);
        while(!queue.isEmpty() && queue.peek()<range)
            queue.poll();
        return queue.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as su= new RecentCounter();
 * int param_1 = obj.ping(t);
 */
