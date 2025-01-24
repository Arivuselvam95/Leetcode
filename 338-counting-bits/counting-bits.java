class Solution {
    public int[] countBits(int n) {
        if(n==0)
            return new int[]{0};
        int arr[] = new int[n+1];
        for(int i=0;i<=n;i++){
            String bin = Integer.toBinaryString(i).replace("0","");
            arr[i] = bin.length();
        }
        return arr;
    }
}