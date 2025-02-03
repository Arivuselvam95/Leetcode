class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
        int max = 0;
        int inc=1;
        int dec=1;
        for(int i=0;i<n-1;i++)
        {
            if(nums[i]<nums[i+1]){
                inc++;
            }else{
                max = max<inc ? inc : max;
                inc=1;
            }
            if(nums[i]>nums[i+1]){
                dec++;
            }else{
                max = max< dec? dec : max;
                dec=1;
            }
        }
        max = max< dec? dec : max;
        max = max< inc? inc : max;
        return max;
    }
}