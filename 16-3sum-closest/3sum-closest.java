class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int closet = nums[0]+nums[1]+nums[2];
        for(int i=0;i<n-2;i++){
            int sum = nums[i];
            int left = i+1;
            int right = n - 1;
            while(left<right){
                int a = sum+nums[left]+nums[right];
                closet = Math.abs(a-target) < Math.abs(closet-target) ? a : closet;
                if(a>target)
                    right--;
                else
                    left++;
            }
        }
        return closet;
    }
}