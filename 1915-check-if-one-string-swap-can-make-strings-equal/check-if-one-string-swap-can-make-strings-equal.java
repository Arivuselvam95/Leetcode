class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int count=0;
        int freq[] = new int[26]; 
        for(int i=0;i<s1.length();i++){
            freq[s1.charAt(i)-'a']++;
            freq[s2.charAt(i)-'a']--;
            if(s1.charAt(i)!=s2.charAt(i))
                count++;
        }
        for(int i : freq)
            if(i!=0)
                return false;
        return count == 2 || count == 0;
    }
}