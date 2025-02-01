class Solution {
    private static boolean prime(int n){
        if(n<2)
            return false;
        for(int i = 2 ; i*i <= n ;i++)
            if(n%i==0)
                return false;
        return true;
    }
    public int nonSpecialCount(int l, int r) {
        int ans = 0 ;
        for(int i = 2 ; i*i <= r ;i++){
            if(prime(i) && i*i>=l && i*i<=r)
                ans++;
        }
        return r-l+1-ans;
    }
}