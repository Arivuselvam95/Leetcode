class Solution {
    public String makeFancyString(String s) {
       StringBuilder sb = new StringBuilder(s);
       int n = s.length();
       for(int i=0;i<n-2;i++){
            if(sb.charAt(i)==sb.charAt(i+1)&& sb.charAt(i+1)==sb.charAt(i+2)){
                sb.deleteCharAt(i);
                i--;
                n--;
            }
       }
       return sb.toString(); 
    }
}