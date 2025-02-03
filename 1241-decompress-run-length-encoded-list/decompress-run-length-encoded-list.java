class Solution {
    public int[] decompressRLElist(int[] nums) {
        int len = 0;
        for(int i=0; i<nums.length ;i+=2){
            len+=nums[i];
        }
        int arr[] = new int[len];
        int index=0;
        for(int i=1;i<nums.length;i+=2){
            Arrays.fill(arr,index,index+nums[i-1],nums[i]);
            index+=nums[i-1];
        }
        return arr;
    }
}