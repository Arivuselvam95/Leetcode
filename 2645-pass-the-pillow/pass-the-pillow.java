class Solution {
    public int passThePillow(int n, int time) {
        // int quotient = time / (n -1);
        // int remainder = time % (n -1);
        // if(quotient%2==0)
        //     return remainder+1;
        // return n - remainder;
        int arr[] = new int[n*2-2];
        for(int i=1;i<=n;i++)
            arr[i-1]=i;
        for(int i=1;i<n-1;i++)
            arr[n+i-1]=n-i;
        int i=0;
        while(time!=0){
            i++;
            i%=arr.length;
            time--;
        }
        return arr[i];
    }
}