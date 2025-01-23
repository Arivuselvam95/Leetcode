class Solution {
    private int isConsistent(String str,int[] arr){
        int ans=1;
        for(char ch : str.toCharArray()){
            if(arr[ch-'a']==0){
                ans=0;
                break;
            }
        }
        return ans;
    }
    public int countConsistentStrings(String allowed, String[] words) {
        int[] freq = new int[26];
        for(char ch : allowed.toCharArray())
            freq[ch-'a']=1;
        
        int count=0;
        for(String word : words){
            count+=isConsistent(word,freq);
        }
        return count;
    }
}