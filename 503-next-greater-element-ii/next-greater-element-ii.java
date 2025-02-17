class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int j = (i + 1) % n; 
            boolean found = false;
            while (j != i) {
                if (nums[j] > nums[i]) {
                    arr[i] = nums[j];
                    found = true;
                    break;
                }
                j++;
                if(j==n)
                    j=0; 
            }
            if (!found) {
                arr[i] = -1; 
            }
        }

        return arr;
    }
}
