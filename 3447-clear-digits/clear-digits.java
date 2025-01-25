class Solution {
    public String clearDigits(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch > '9' || ch < '0')
                stack.push(ch);
            else
                stack.pop();
        }
        String str = "";
        for(char ch : stack)
            str+=ch;
        return str;
    }
}