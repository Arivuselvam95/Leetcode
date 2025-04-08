class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int n = nums.length;
        int ans = 0;
        
        for(int i=0;i<n;i++){
            int count=1;
            for(int j=i;j<n-1;j++){
                if(nums[j]<nums[j+1])
                    count++;
                else{
                    ans = Math.max(ans,count);
                    count=1;
                    break;
                }
            }
            ans = Math.max(ans,count);
        }
        return ans;
    }
}