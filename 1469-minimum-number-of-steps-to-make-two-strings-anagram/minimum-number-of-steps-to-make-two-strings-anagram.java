class Solution {
    public int minSteps(String s, String t) {
        int freq[] = new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
        }
        int count=0;
        for(int i : freq)
            count+=Math.abs(i);
        return count/2;
    }
}