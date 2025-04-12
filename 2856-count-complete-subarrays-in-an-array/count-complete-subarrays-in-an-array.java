class Solution {
    public int countCompleteSubarrays(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums)
            set.add(i);
        int n = nums.length;
        int count = 0;
        for(int i=0;i<n;i++){
            HashSet<Integer> check = new HashSet<>();
            for(int j=i;j<n;j++){
                check.add(nums[j]);
                if(set.equals(check))
                    count++;
            }
        }
        return count;
    }
}