class Solution {
    public int trap(int[] height) {
        	int[] lmax=new int [height.length];
		int[] rmax=new int [height.length];
		int amount=0;
		lmax[0]=height[0];
		rmax[height.length-1]=height[height.length-1];
		for(int i=0;i<lmax.length-1;i++) {
			if(lmax[i]<=height[i+1])
				lmax[i+1]=height[i+1];
			else
				lmax[i+1]=lmax[i];
		}
		for(int i=height.length-1;i>0;i--) {
			if(rmax[i]<=height[i-1])
				rmax[i-1]=height[i-1];
			else
				rmax[i-1]=rmax[i];
		}
			
		for(int i=1;i<height.length-1;i++) {
			if(rmax[i]>=lmax[i])
				amount+=lmax[i]-height[i];
			else
				amount+=rmax[i]-height[i];
		}
        return amount;
    }
}