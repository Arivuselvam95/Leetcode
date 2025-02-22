class Solution {
    public int hammingWeight(int n) {
        String str = Integer.toBinaryString(n);
        int len = str.length();
        str = str.replace("1","");
        return len - str.length();
    }
}