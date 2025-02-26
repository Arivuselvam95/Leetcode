class Solution {
    public int minInsertions(String s) {
        Stack<Character> stack = new Stack<>();
        int count = 0;
        int i = 0;
        while (i < s.length()) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(c);
            } else { 
                if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
                    i++;
                } else {
                    count++;
                }
                if (!stack.isEmpty()) {
                    stack.pop(); 
                } else {
                    count++;
                }
            }
            i++;
        }
        count += stack.size() * 2;
        return count;
    }
}