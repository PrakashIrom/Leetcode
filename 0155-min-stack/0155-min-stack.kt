class MinStack() {
    
   var list=mutableListOf<Int>()
   var minValue=mutableListOf<Int>()
   
    
    fun push(`val`: Int) {
         if(list.isEmpty()){
             minValue.add(`val`)
         }else{
             if(`val`<minValue[minValue.size-1])
             {
                 minValue.add(`val`)
             }
             else{
                 minValue.add(minValue[minValue.size-1])
             }
         }
         list.add(`val`)
    }

    fun pop() {
     list.removeAt(list.size-1)
     minValue.removeAt(minValue.size-1)
    }

    fun top(): Int {
       return list[list.size-1]
    }

    fun getMin(): Int {
        return minValue[minValue.size-1]
    }

}

/**
 * Your MinStack object will be instantiated and called as such:
 * var obj = MinStack()
 * obj.push(`val`)
 * obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.getMin()
 */