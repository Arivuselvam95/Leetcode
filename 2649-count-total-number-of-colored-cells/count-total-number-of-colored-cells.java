class Solution {
    public long coloredCells(int n) {
        // long ans = n*n + (n-1)*(n-1);
        long ans = 0;
        for(int i=1;i<=n;i++)
            if(i==1)
                ans+=1;
            else
                ans+=(4*(i-1));
        return ans;
    }
}