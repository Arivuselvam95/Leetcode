class Solution {
    public String makeGood(String s) {
        int len = 0;
        while(len!=s.length()){
            len = s.length();
            for(int i=0;i<26;i++){
                String r1 = (char)('a'+i)+""+(char)('A'+i);
                String r2 = (char)('A'+i)+""+(char)('a'+i);
                s = s.replace(r1,"");
                s = s.replace(r2,"");
            }
        }
        return s;
    }
}