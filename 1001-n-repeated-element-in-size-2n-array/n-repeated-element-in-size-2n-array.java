class Solution {
    public int repeatedNTimes(int[] nums) {
        Arrays.sort(nums);
        if(nums[0]==nums[nums.length/2-1])
            return nums[0];
        return nums[nums.length/2];
    }
}