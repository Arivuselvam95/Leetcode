class Solution {
    public int numDecodings(String s) {
        int ans[] = new int[s.length()+1];
        ans[0] = 1;
        ans[1] = s.charAt(0)=='0'?0:1;
        for(int i=2;i<=s.length();i++){
            int oneDigit = Integer.valueOf(s.substring(i-1,i));
            int twoDigit = Integer.valueOf(s.substring(i-2,i));
            if(oneDigit>0) ans[i]+=ans[i-1];
            if(twoDigit>=10 && twoDigit<=26) ans[i]+=ans[i-2];
        }
        return  ans[s.length()];   
    }
}