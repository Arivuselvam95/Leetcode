class Solution {
    public static boolean isAnagram(String a, String b){
        int freq[] = new int[26];
        for(int i=0;i<a.length();i++){
            freq[a.charAt(i)-'a']++;
            freq[b.charAt(i)-'a']--;
            
        }
        for(int i : freq)
            if(i!=0)
                return false;
        return true;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            if(strs[i]!="-1"){
                List<String> l = new ArrayList<>();
                l.add(strs[i]);
                for(int j=i+1;j<strs.length;j++){
                    if(!strs[j].equals("-1") && strs[i].length()==strs[j].length() && isAnagram(strs[i],strs[j])){
                        l.add(strs[j]);
                        strs[j] = "-1";
                    }
                }
                list.add(l);
            }
        }
        return list;
    }
}