class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles;
        while(numBottles >= numExchange){
            int filled = numBottles/numExchange;
            numBottles = filled + numBottles%numExchange;
            ans+=filled;
        }
        return ans;
    }
}