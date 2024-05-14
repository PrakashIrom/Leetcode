class Solution {
    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
         
        nums1.sort()
        nums2.sort()
        
        var l=0
        var r=0
        var arr = ArrayList<Int>()
        
        while(l<nums1.size && r<nums2.size){
            if(nums1[l]<nums2[r]){
                l++
            }
            else if(nums2[r]<nums1[l]){
                r++
            }
            else{
                arr.add(nums1[l])
                l++
                r++
            }
        }
        
         return arr.toIntArray()
    }
}