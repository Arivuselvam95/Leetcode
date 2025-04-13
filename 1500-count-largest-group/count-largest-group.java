class Solution {
    public int countLargestGroup(int n) {
        int freq[] = new int[40];
        int maxFreq = 0;
        for(int i=1;i<=n;i++){
            int temp = i;
            int sum = 0;
            while(temp>0){
                sum+=temp%10;
                temp/=10;
            }
            freq[sum]++;
            maxFreq = Math.max(maxFreq,freq[sum]);
        }
        int count = 0;
        for(int i : freq) if(i==maxFreq) count++;
        return count;
    }
}