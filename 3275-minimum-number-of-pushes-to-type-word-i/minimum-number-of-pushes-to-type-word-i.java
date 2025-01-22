class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int i=1;
        int ans=0;
        while(n>=1){
            if(n>=8)
                ans+=(8*i);
            else
                ans+=(n*i);
            n-=8;
            i++;
        }
        return ans;
    }
}