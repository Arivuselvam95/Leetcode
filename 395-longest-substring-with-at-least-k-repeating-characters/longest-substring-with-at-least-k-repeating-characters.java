class Solution {
    public int longestSubstring(String s, int k) {
        return helper(s, 0, s.length(), k);
    }

    private int helper(String s, int start, int end, int k) {
        if (end - start < k) return 0;  
        
        int[] freq = new int[26];  
        for (int i = start; i < end; i++) {
            freq[s.charAt(i) - 'a']++;
        }

        for (int i = start; i < end; i++) {
            if (freq[s.charAt(i) - 'a'] < k) {  
                int left = helper(s, start, i, k);
                int right = helper(s, i + 1, end, k);
                return Math.max(left, right);
            }
        }

        return end - start;  
    }
}
