class Solution {
    private static boolean palindrome(String str){
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        String ans = "";
        int n = s.length();
        for(int i=0;i<n;i++){
            for(int j = i;j<n;j++){
                String str = s.substring(i,j+1);
                if(palindrome(str) && str.length()>ans.length())
                    ans = str;
            }
        }
        return ans;
    }
}
