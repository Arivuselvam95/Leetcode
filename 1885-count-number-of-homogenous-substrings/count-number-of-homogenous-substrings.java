class Solution {
    public int countHomogenous(String s) {
        int n = s.length();
        long count = 1;
        long ans = 0;
        for(int i=0;i<n-1;i++)
            if(s.charAt(i)==s.charAt(i+1))
                count++;
            else{
                ans+=(count*(count+1))/2;
                count=1;
            }
        ans+=(count*(count+1))/2;
        return (int)(ans%1000000007);
    }
}