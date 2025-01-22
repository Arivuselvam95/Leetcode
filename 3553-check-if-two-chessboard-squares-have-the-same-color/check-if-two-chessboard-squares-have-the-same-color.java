class Solution {
    public boolean checkTwoChessboards(String c1, String c2) {
        int a1=c1.charAt(0)-'a'+1,a2=c1.charAt(1)-'0'+1;
        int b1=c2.charAt(0)-'a'+1,b2=c2.charAt(1)-'0'+1;
        int a=Math.abs(a1-a2)%2;
        int b=Math.abs(b1-b2)%2;
        return a==b;
    }
}