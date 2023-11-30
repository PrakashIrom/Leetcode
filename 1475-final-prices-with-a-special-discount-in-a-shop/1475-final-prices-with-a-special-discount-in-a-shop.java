class Solution {
    public int[] finalPrices(int[] prices) {
     		Deque<Integer> stack = new LinkedList<>();
            stack.push(prices[prices.length-1]);
            int res[]=new int[prices.length];
            res[prices.length-1]=prices[prices.length-1];
            for(int i=prices.length-2;i>=0;i--){
                while(!stack.isEmpty() && stack.peek()>prices[i])
                    stack.pop();
                if(!stack.isEmpty())
                    res[i]=prices[i]-stack.peek();
                else
                    res[i]=prices[i];
                stack.push(prices[i]);
            }
            return res;
    }
}