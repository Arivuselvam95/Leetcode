class Solution {
    public int pivotInteger(int n) {

        int sum = (n*(n+1))/2;
        for(int i =1 ;i<=n;i++){
            int a = (i*(i+1))/2;
            if(sum - a + i == a)
                return i;
        }
        return -1;
    }
}