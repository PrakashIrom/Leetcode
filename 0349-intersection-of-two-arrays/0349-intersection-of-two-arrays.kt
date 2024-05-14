class Solution {
    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        
        var hs = HashSet<Int>()
        var arr= ArrayList<Int>()
        
        for(i in 0 until nums1.size){
            hs.add(nums1[i])
        }
        
        for(i in 0 until nums2.size){
            if(hs.contains(nums2[i])){
                arr.add(nums2[i])
                hs.remove(nums2[i])
            }
        }
        
        return arr.toIntArray()
    }
}