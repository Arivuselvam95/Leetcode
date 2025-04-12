class Solution {
    public static boolean isSubsequence(String str,String check){
        int index = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==check.charAt(index))
                index++;
            if(index==check.length())
                return true;
        }
        return false;
    }
    public int numMatchingSubseq(String s, String[] words) {
        int count = 0;
        HashMap<String, Integer> map = new HashMap<>();
        for(String word : words)
            map.put(word,map.getOrDefault(word,0)+1);
        for(String word : map.keySet())
            if(isSubsequence(s,word))
                count+=map.get(word);
        return count;
    }
}