class Solution {

    public int tribonacci(int n) {
        int a=0,b=1,c=1;
        if(n<2)
        return n;

        n-=3;
        for(int i=0;i<=n;i++){
            int temp= a+b+c;
            a=b;
            b=c;
            c=temp;
        }
        return c;
    }
}