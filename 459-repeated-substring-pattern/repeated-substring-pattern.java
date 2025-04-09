class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        String substr = "";
        for(int i=0;i<n/2;i++){
            substr += s.charAt(i);
            if(n%substr.length()==0)
                if(substr.repeat(n/substr.length()).equals(s))
                    return true;
        }
        return false;
    }
}