class Solution {
    public int[] closestPrimes(int left, int right) {
        boolean prime[] = new boolean[right + 1];
        for (int i = 0; i <= right; i++)
            prime[i] = true;
        prime[1] = false;
        for (int p = 2; p * p <= right; p++) {
            if (prime[p] == true) {
                for (int i = p * p; i <= right; i += p)
                    prime[i] = false;
            }
        }
        int prev=-1;
        int min = right;
        int[] ans = {-1,-1};
        
        for (int i = left; i <= right; i++) {
            if (prime[i] == true){
                if(prev!=-1){
                    if((i-prev)<min){
                        ans[0] = prev;
                        ans[1] = i;
                        min = i-prev;
                    }
                }
                prev = i;
            }
        }
        return ans;
    }
}