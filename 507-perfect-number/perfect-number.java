class Solution {
    public boolean checkPerfectNumber(int num) {
        int ans = 0;
        for(int i=1;i<num/2+1;i++){
            if(num%i==0)
                ans+=i;
        }
        return ans==num;
    }
}