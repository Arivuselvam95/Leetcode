class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for(int[] account : accounts){
            int sum = 0;
            for(int bal : account)
                sum += bal;
            ans = ans<sum ? sum : ans;
        }
        return ans;
    }
}