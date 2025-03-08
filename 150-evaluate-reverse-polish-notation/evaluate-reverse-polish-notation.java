class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String str : tokens){
            if(str.matches("-?\\d+"))
                stack.push(Integer.valueOf(str));
            else{
                int a=stack.pop();
                int b=stack.pop();
                if(str.equals("+"))
                    stack.push(b+a);
                else if(str.equals("-"))
                    stack.push(b-a);
                else if(str.equals("/"))
                    stack.push(b/a);
                else if(str.equals("*"))
                    stack.push(b*a);
            }
        }
        return stack.pop();
    }
}