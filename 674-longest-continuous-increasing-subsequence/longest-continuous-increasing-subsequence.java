class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int n = nums.length;
        int ans = 0;
        
        int count=1;
        for(int i=0;i<n-1;i++){
            if(nums[i]<nums[i+1])
                count++;
            else{
                ans = Math.max(ans,count);
                count=1;
            }
        }
        ans = Math.max(ans,count);
        return ans;
    }
}