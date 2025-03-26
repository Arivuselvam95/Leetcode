class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int max = 0;
        int index = -1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1])
                if(arr[i]>max){
                    max = arr[i];
                    index = i;
                }
        }
        return index;
    }
}