class Solution {
    public static boolean palindrome(String str){
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i++)!=str.charAt(j--))
                return false;
        }
        return true;
    }
    public int longestPalindrome(String s, String t) {
        int max = 0;
        int n = s.length();
        int m = t.length();
        for(int i=0;i<n;i++){
            for(int j=i;j<=n;j++){
                String s1 = s.substring(i,j);
                for(int x=0;x<m;x++){
                    for(int y=x;y<=m;y++){
                        String t1 = t.substring(x,y);
                        if(palindrome(s1+t1))
                            max = Math.max(max,s1.length()+t1.length());
                    }
                }
            }
        }
        return max;
    }
}