class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int ans = Integer.MAX_VALUE;
        int n = nums.length;
        int start = 0;
        int sum = 0;
        for(int end = 0;end<n;end++){
            sum+=nums[end];
            if(sum>=target){
                ans = Math.min(ans,end-start+1);
                while(sum>target && start<end){
                    sum-=nums[start++];
                    if(sum>=target)
                        ans = Math.min(ans,end-start+1);
                }
            }
        }
        return ans==Integer.MAX_VALUE ? 0 : ans;
    }
}