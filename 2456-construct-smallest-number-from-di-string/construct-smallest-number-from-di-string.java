class Solution {
    public String smallestNumber(String pattern) {
        Stack<Integer> stack = new Stack<>();
        int n = 1;
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<pattern.length();i++){
            if(pattern.charAt(i)=='I'){
                ans.append(n);
                while(!stack.isEmpty())
                    ans.append(stack.pop());
            }else{
                stack.push(n);
            }
            n++;
        }
        ans.append(n);
        while(!stack.isEmpty())
            ans.append(stack.pop());
        return ans.toString();
    }
}