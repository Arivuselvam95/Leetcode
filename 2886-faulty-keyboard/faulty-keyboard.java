class Solution {
    public String finalString(String s) {
        int n = s.length();
        char[] res = new char[n];
        int index = 0;
        for(char ch : s.toCharArray()){
            if(ch=='i'){
                int i = 0;
                int j = index-1;
                while(i<j){
                    char temp = res[i];
                    res[i] = res[j];
                    res[j] = temp;
                    i++;
                    j--;
                }
            }else{
                res[index++] = ch;
            }
        }
        return new String(res,0,index);
    }
}