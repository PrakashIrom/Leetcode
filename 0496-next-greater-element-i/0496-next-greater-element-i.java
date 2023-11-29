class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int j,k=0;
        for(int i=0;i<nums1.length;i++){
            for(j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    for(k=j+1;k<nums2.length;k++){
                        if(nums1[i]<nums2[k]){
                            nums1[i]=nums2[k];
                            break;
                        }
                    }
                    break;
                }
            }
            if(k==nums2.length)
            {
            nums1[i]=-1;    
             }
        }
        return nums1;
    }
}