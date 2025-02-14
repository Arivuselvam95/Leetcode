class Solution {
    private static boolean isAnagram(String str, String p){
        int freq[] = new int[26];
        for(int i=0;i<p.length();i++){
            freq[p.charAt(i)-'a']++;
            freq[str.charAt(i)-'a']--;
        }
        for(int ele : freq)
            if(ele!=0)
                return false;
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int len = p.length();
        int n = s.length();
        for(int i=0;i<= n-len;i++)
            if(isAnagram(s.substring(i,i+len), p))
                list.add(i);
        return list;
    }
}