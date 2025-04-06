class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        for(int price : prices){
            min = min > price ? price : min;
            max = max < price - min ? price - min : max;
        }
        return max;
    }
}