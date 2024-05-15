class MyHashSet() {

    var arr = IntArray(1000001){-1}
    
    fun add(key: Int) {
        arr[key]=key    
    }

    fun remove(key: Int) {
        if(arr[key]!=-1){
            arr[key]=-1
        }
    }

    fun contains(key: Int): Boolean {
        if(arr[key]==-1) return false
        return true
    }

}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * var obj = MyHashSet()
 * obj.add(key)
 * obj.remove(key)
 * var param_3 = obj.contains(key)
 */