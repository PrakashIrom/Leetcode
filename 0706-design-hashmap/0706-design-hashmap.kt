class MyHashMap() {
    
    var arr = IntArray(1000001){-1}
    
    fun put(key: Int, value: Int) {
     arr[key]=value   
    }

    fun get(key: Int): Int {
        if(arr[key]==-1) return -1
        return arr[key]
    }

    fun remove(key: Int) {
        arr[key]=-1
    }

}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * var obj = MyHashMap()
 * obj.put(key,value)
 * var param_2 = obj.get(key)
 * obj.remove(key)
 */