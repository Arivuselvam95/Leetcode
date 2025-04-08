class Solution {
    public int rearrangeCharacters(String s, String target) {
        int freq[] = new int[26];
        char str[] = target.toCharArray();
        for(char ch : s.toCharArray())
            freq[ch-'a']++;
        int count=0;
        while(true){
            boolean flag = false;
            for(char ch : str){
                if(freq[ch-'a']>0)
                    freq[ch-'a']--;
                else{
                    flag = true;
                    break;
                }
            }
            if(flag) break;
            count++;
        }
        return count;
    }
}