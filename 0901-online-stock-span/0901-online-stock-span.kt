import java.util.ArrayDeque

class StockSpanner() {
    
    var stock=ArrayDeque<Int>()
    var span=ArrayDeque<Int>()
   
    
    fun next(price: Int): Int {
        
        var count=1
        
        if(stock.isEmpty())
        {
            stock.push(price)
            span.push(1)
        }
        else
        {
            
           while(stock.isNotEmpty() && stock.peek()<=price)
            {
                count+=span.peek()
                span.pop()
                stock.pop()
            }
              
            span.push(count)
            stock.push(price)
            
        }
        
      return count
    }
                   
}



/**
 * Your StockSpanner object will be instantiated and called as such:
 * var obj = StockSpanner()
 * var param_1 = obj.next(price)
 */