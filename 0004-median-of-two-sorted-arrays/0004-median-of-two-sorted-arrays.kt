class Solution {
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double 
    {
        
        var left=0
        var right=0
        var centre=0
        var nums3=IntArray(nums1.size+nums2.size)
        
        while(left<nums1.size && right<nums2.size){
            if(nums1[left]<=nums2[right]){
                nums3[centre]=nums1[left]
                left++
            }
            else{
                nums3[centre]=nums2[right]
                right++
            }
            centre++
        }
        
        while(left<nums1.size || right<nums2.size){
            if(left<nums1.size){
                nums3[centre]=nums1[left++]
            }
            else{
                nums3[centre]=nums2[right++]
            }
            centre++
        }
        
        if(nums3.size%2!=0){
            return nums3[nums3.size/2].toDouble()
        }
        return (nums3[nums3.size/2-1]+nums3[nums3.size/2])/2.toDouble()
    }
}