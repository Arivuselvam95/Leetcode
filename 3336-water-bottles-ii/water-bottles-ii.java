class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int ans = numBottles;
        while(numBottles >= numExchange){
            int filled = 1;
            numBottles -= numExchange;
            numExchange++;
            while(numBottles >= numExchange){
                filled++;
                numBottles -= numExchange;
                numExchange++;
            }
            ans+=filled;
            numBottles += filled;
        }
        return ans;
    }
}