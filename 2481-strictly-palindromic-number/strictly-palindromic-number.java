class Solution {
    public boolean isStrictlyPalindromic(int n) {
        for(int i=2;i<=n-2;i++){
            StringBuilder str = new StringBuilder(Integer.toString(Integer.valueOf(9+"",10),i));
            StringBuilder s = new StringBuilder(str);
            if(!s.equals(str.reverse()))
                return false;
        }
        return true;
    }
}