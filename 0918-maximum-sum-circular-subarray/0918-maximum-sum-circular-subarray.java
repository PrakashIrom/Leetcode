class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        NormalSum ns = new NormalSum();
        int res1=ns.Sum(nums),res2=0;
        if(res1<0)
            return res1;
        for(int i=0;i<nums.length;i++){
            res2+=nums[i];
            nums[i]=-nums[i];
        }
        int sum=ns.Sum(nums);
        res2=sum+res2;
        if(res2<res1)
            return res1;
        return res2;
    }
}
class NormalSum{
    public int Sum(int sum[]){
    int currsum=sum[0],res=sum[0];
        for(int i=1;i<sum.length;i++){
            if(sum[i]<sum[i]+currsum)
                currsum=sum[i]+currsum;
            else
                currsum=sum[i];
            if(res<currsum)
                res=currsum;
        }
        return res;
    }
}