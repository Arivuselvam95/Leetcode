class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans="";
        // Arrays.sort(strs);
        for(int i=0;i<strs[0].length();i++){
            for(String str: strs){
                if(!str.startsWith(strs[0].substring(0,i+1))){
                    return ans;
                }
            }
            ans = strs[0].substring(0,i+1);
        }
        return ans;
    }
}