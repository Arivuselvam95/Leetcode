class Solution {
    public String reverseWords(String s) {
        char[] str = s.toCharArray();
        int n = str.length;
        int start = 0;
        for(int i=0;i<n;i++){
            if(str[i]==' '){
                int end = i-1;
                while(start<end){
                    char temp = str[start];
                    str[start] = str[end];
                    str[end] = temp;
                    start++;
                    end--;
                }
                start=i+1;
            }
        }
        int end = n-1; 
        while(start<end){
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
        return new String(str);
    }
}