class Solution {
    public int maxAscendingSum(int[] nums) {
        int maxSubarraySum = Integer.MIN_VALUE;
        int sum = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i])
                sum+=nums[i];
            else{
                maxSubarraySum = maxSubarraySum < sum ? sum : maxSubarraySum;
                sum=nums[i];
            }
        }
        maxSubarraySum = maxSubarraySum < sum ? sum : maxSubarraySum;
        return maxSubarraySum;
    }
}