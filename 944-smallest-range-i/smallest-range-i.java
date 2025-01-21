class Solution {
    public int smallestRangeI(int[] nums, int k) {
        
        Arrays.sort(nums);
        int ans = nums[nums.length-1]-nums[0]-2*k;
        return ans<0? 0: ans;
    }
}