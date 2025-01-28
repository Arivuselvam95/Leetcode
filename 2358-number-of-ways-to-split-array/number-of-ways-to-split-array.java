class Solution {
    public int waysToSplitArray(int[] nums) {
        long total_sum = 0;
        for(int i=0;i<nums.length;i++)
            total_sum+=nums[i];

        long prefix_sum =0 ;
        int count = 0;

        for(int i=0;i<nums.length-1;i++){
            prefix_sum += nums[i];
            if(prefix_sum >= total_sum - prefix_sum)
                count++;
        }
        return count;
    }
}