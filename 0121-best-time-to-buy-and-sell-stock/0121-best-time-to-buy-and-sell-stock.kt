class Solution {
    fun maxProfit(prices: IntArray): Int {
     
    var profit=0
    var stock=prices[0]
        
    for(i in 1 until prices.size){
        if(stock>prices[i]){
            stock=prices[i]
        }
        if(profit<prices[i]-stock){
            profit=prices[i]-stock
        }
    }
    return profit
    }
}