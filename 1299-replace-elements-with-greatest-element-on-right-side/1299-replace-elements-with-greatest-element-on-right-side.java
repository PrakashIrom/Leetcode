class Solution {
    public int[] replaceElements(int[] arr) {
    int large=0;
        for(int i=0;i<arr.length-1;i++){
            int j=i+1;
            large=arr[j];
            while(j<arr.length-1){
                if(large<arr[j+1])
                    large=arr[j+1];
                j++;
            }
            arr[i]=large;
        }
        arr[arr.length-1]=-1;
        return arr;
    }
}