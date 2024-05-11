class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        var j=m
        for(i in 0 until n)
        {
            nums1[j++]=nums2[i]
        }
        nums1.sort()
    }
}