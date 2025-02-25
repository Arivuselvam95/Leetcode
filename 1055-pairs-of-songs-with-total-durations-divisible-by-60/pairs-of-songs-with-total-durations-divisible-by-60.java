class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int freq[] = new int[60];
        for(int i: time)
            freq[i%60]++;
        int count=0;
        for(int i : time){
            if(i%60==0)
                count+=(--freq[0]);
            else if(i%60==30)
                count+=(--freq[30]);
            else{
                count+=(freq[60-i%60]);
                freq[i%60]--;
            }
        }
        return count;
    }
}