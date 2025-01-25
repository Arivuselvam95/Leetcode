class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int j = (i + 1) % n; // Start checking from the next index
            boolean found = false;

            while (j != i) {
                if (nums[j] > nums[i]) {
                    arr[i] = nums[j];
                    found = true;
                    break;
                }
                j = (j + 1) % n; // Move to the next index in circular fashion
            }

            if (!found) {
                arr[i] = -1; // If no greater element is found
            }
        }

        return arr;
    }
}
