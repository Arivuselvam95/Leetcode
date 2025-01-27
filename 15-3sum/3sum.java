class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> setAns = new HashSet<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int temp = nums[i] + nums[left] + nums[right];

                if (temp == 0) {
                    setAns.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                } else if (temp > 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }

        return new ArrayList<>(setAns);
    }
}
