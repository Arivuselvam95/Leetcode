class Solution {
    public static boolean isValid(char[] str, int[] freq){
        int count[] = new int[26];
        for(char ch : str)
            count[ch-'a']++;
        for(int i=0;i<26;i++)
            if(freq[i]<count[i])
                return false;
        return true;
    }
    public int countCharacters(String[] words, String chars) {
        int count = 0;
        int freq[] = new int[26];
        for(char ch : chars.toCharArray())
            freq[ch-'a']++;
        for(String word : words){
            if(isValid(word.toCharArray(),freq))
                count+=word.length();
        }
        return count;
    }
}