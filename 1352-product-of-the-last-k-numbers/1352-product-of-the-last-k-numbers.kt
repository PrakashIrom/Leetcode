class ProductOfNumbers() {

    // 3 0 2 5 4 8 
    // in the add function use list to add the all the integers
    val list = mutableListOf<Int>()
    
    fun add(num: Int) {
        list.add(num)
    }

    fun getProduct(k: Int): Int {
        
        var prod = 1
        var ptr = list.size-1
        var count = 0
        
        while(count!=k){
            prod*=list[ptr--]
            count++
        }
        
        return prod
        
        //for(i in list.size-1 downTo )
    }

}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * var obj = ProductOfNumbers()
 * obj.add(num)
 * var param_2 = obj.getProduct(k)
 */