class Solution {
    public String countAndSay(int n) {
        String ans = "1";
        for(int i =1;i<n;i++){
            ans = runLengthEncoding(ans);
        }
        return ans;
    }
    public static String runLengthEncoding(String str){
        StringBuilder res = new StringBuilder();
        int count = 1;
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1))
                count++;
            else{
                res.append(count).append(str.charAt(i));
                count = 1;
            }
        }
        res.append(count).append(str.charAt(str.length()-1));
        return res.toString();
    }
}