class Solution {
    public String decodeString(String s) {
        Stack<Integer> times = new Stack<>();
        Stack<String> stack = new Stack<>();
        String ans="";
        String t = "";
        for(char ch : s.toCharArray()){
            if(ch>='0' && ch<='9')
                t+=ch;
            else if(ch=='['){
                times.push(Integer.valueOf(t));
                stack.push("[");
                t="";
            }
            else if(ch==']'){
                String str="",a="";
                while(!stack.peek().equals("["))
                    str=stack.pop()+str;
                stack.pop();
                int time = times.pop();
                for(int i=0;i<time;i++)
                    a+=str;
                if(stack.isEmpty())
                    ans+=a;
                else
                    stack.push(a);

            }else{
                stack.push(ch+"");
            }
        }
        String str = "";
        while(!stack.isEmpty()) 
        str = stack.pop()+str;
        return ans+str;
    }
}