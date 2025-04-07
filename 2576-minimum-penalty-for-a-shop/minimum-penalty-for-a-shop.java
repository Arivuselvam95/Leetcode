class Solution {
    public int bestClosingTime(String customers) {
        char arr[] = customers.toCharArray();
        int n = customers.length();
        int[] countN = new int[n];
        int[] countY = new int[n];

        countN[0] = arr[0]=='N'? 1 : 0;
        for(int i=1;i<n;i++)
            countN[i] = arr[i]=='N' ? countN[i-1]+1 : countN[i-1];

        countY[n-1] = arr[n-1]=='Y'? 1 : 0;
        for(int i=n-2;i>=0;i--)
            countY[i] = arr[i]=='Y' ? countY[i+1]+1 : countY[i+1];
        int min = Integer.MAX_VALUE;
        int index = 0;
        for(int i=0;i<n;i++){
            if(min > countY[i]+countN[i]){
                min = countY[i]+countN[i];
                index = i+1;
            }
        }
        return index==1 && arr[0]=='N'?0:index;
    }
}