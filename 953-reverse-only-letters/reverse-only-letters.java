class Solution {
    public String reverseOnlyLetters(String s) {
        int i = 0;
        int j = s.length()-1;
        char str[] = s.toCharArray();
        while(i<j){
            if(!Character.isLetter(str[i])){
                i++;
            }else if(!Character.isLetter(str[j])){
                j--;
            }else{
                char temp = str[i];
                str[i] = str[j];
                str[j] = temp;
                i++;
                j--;
            }
        }
        return new String(str);
    }
}