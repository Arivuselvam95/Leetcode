class Solution {
    public int sumBase(int n, int k) {
        int ans = 0;
        int a = 1;
        while(n!=0){
            ans = (n%k)*a+ ans;
            a*=10;
            n/=k;
        }
        int sum = 0;
        while(ans!=0){
            sum+=ans%10;
            ans/=10;
        }
        return sum;
    }
}