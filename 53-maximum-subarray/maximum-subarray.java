class Solution {
    public int maxSubArray(int[] nums) {
        int sum=nums[0],max=nums[0];
        for(int i=1;i<nums.length;i++){
            sum+=nums[i];
            if(nums[i]>sum)
                sum=nums[i];
            if(sum>max)
                max=sum;
        }
        return max;
    }
}