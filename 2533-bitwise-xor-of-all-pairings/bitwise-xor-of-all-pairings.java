class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int xor1 = 0, xor2 = 0;
        int n = nums1.length, m = nums2.length;
        for(int i : nums1) {
            xor1 = xor1 ^ i;
        }
        for(int i : nums2) {
            xor2 = xor2 ^ i;
        }

        if(n % 2 != 0 && m % 2 == 0) {
            return xor2;
        }

        if(n % 2 == 0 && m % 2 != 0) {
            return xor1;
        }
        if(n % 2 != 0 && m % 2 != 0) {
            return xor1 ^ xor2;
        }
        return 0;
    }
}