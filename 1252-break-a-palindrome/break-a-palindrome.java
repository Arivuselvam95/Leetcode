class Solution {
    public static boolean isPalin(char str[],int index){
        char temp = str[index];
        str[index]='a';
        int i=0;
        int j= str.length-1;
        while(i<j){
            if(str[i++]!=str[j--]){
                return false;
            }
        }
        str[index] = temp;
        return true;
    }
    public String breakPalindrome(String palindrome) {
        char str[] = palindrome.toCharArray();
        if(str.length==1) return "";

        boolean flag = true;
        for(int i=0;i<str.length;i++){
            if(str[i]!='a' && !isPalin(str,i)){
                flag = false;
                break;
            }
        }
        if(flag) str[str.length-1] = 'b';
        return new String(str);
    }
}