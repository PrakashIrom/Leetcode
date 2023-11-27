class Solution {
    public int maxDistance(int[] colors) {
        int dist=-1;
        for(int i=0;i<colors.length;i++){
            for(int j=colors.length-1;j>i;j--){
                if(colors[i]!=colors[j] && dist<j-i){
                    dist=j-i;
                }
            }
        }
        return dist;
    }
}