class Solution {
    public String removeKdigits(String num, int k) {
        StringBuilder ans = new StringBuilder(num);
        int index = 0;
        while(index+1<ans.length() && k>0){
            if(ans.charAt(index)>ans.charAt(index+1)){
                ans.deleteCharAt(index);
                k--;
                index--;
                if(index<0)
                    index = 0;
                continue;
            }
            index++;
        }
        while(k>0){
            ans.deleteCharAt(ans.length()-1);
            k--;
        }
        while(ans.length()>1 && ans.charAt(0)=='0'){
            ans.deleteCharAt(0);
        }
        return ans.length()==0 ? "0" : ans.toString();
    }
}