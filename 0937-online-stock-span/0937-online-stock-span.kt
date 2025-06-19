import java.util.ArrayDeque

class StockSpanner() {
    
    var stock=ArrayDeque<Int>()
    var span=ArrayDeque<Int>()
   
    
    fun next(price: Int): Int {
        
        var count=1
            
           while(stock.isNotEmpty() && stock.peek()<=price)
            {
                count+=span.pop()
                stock.pop()
            }
              
            span.push(count)
            stock.push(price)
        
      return count
    }
                   
}



/**
 * Your StockSpanner object will be instantiated and called as such:
 * var obj = StockSpanner()
 * var param_1 = obj.next(price)
 */