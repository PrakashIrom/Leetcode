class Solution {
    fun maxProfit(prices: IntArray): Int {
        var profit=0
        
        for(i in 0 until prices.size-1){
            if(prices[i]<prices[i+1]){
                val sum=prices[i+1]-prices[i]
                profit+=sum
            }
        }
        return profit
    }
}