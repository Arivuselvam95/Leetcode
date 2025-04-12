class Solution {
    public String smallestNumber(String pattern) {
        Stack<Integer> stack = new Stack<>();
        int n = 1;
        String ans = "";
        for(int i=0;i<pattern.length();i++){
            if(pattern.charAt(i)=='I'){
                ans= ans+n;
                while(!stack.isEmpty())
                    ans = ans + stack.pop();
            }else{
                stack.push(n);
            }
            n++;
        }
        ans= ans+n;
        while(!stack.isEmpty())
            ans = ans + stack.pop();
        return ans;
    }
}