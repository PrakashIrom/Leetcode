class Solution {
    public void moveZeroes(int[] nums) {
        //         val count=0
//         val length=nums.size
        
//         for(i in 0 until length){
//             if(nums[i]==0){
//                 count++
//             }
//             else{
//                 val index= if count>i count-i else i-count
//                 val tem=nums[index]
//                 nums[index]=nums[i]
//                 nums[i]=
//             }
//         }
        int j=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                j=i;
                break;
            }
        }
        
        if(j==-1) return;  //no zero
        
        for(int i=j+1;i<nums.length;i++){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
    }
}