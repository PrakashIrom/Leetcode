class Solution {
    public int largestRectangleArea(int[] heights) {
        int ps[]=new int[heights.length];
		int ns[]=new int[heights.length];
		ns=NextSmaller(heights);
		ps=PreSmaller(heights);
		int max=0;
		for(int i=0;i<heights.length;i++) {
			int curr=heights[i]*(ns[i]-ps[i]-1);
			max=Math.max(max, curr);
		}
        return max;
    }
    static int[] NextSmaller(int arr[]){
     		int ns[]=new int[arr.length];
		Deque<Integer> stack = new LinkedList<>();
		for(int i=arr.length-1;i>=0;i--) {
			while(!stack.isEmpty() && arr[i]<=arr[stack.peek()])
				stack.pop();
			if(!stack.isEmpty()) {
				ns[i]=stack.peek();
			}
			else
				ns[i]=arr.length;
			stack.push(i);
		}
		return ns;   
    }
    static int[] PreSmaller(int arr[]){
     int ps[]=new int[arr.length];
		Deque<Integer> stack = new LinkedList<>();
		for(int i=0;i<arr.length;i++) 
		{
			while(!stack.isEmpty() && arr[stack.peek()]>=arr[i])
				stack.pop();
			if(!stack.isEmpty()) {
				ps[i]=stack.peek();
			}
			else {
				ps[i]=-1;
			}
			stack.push(i);
		}
		return ps;   
    }
}