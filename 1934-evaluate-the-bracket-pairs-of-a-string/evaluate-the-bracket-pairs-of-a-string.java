class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String> map = new HashMap<>();
        for(List<String> l : knowledge)
            map.put(l.get(0),l.get(1));
        
        StringBuilder ans = new StringBuilder();
        StringBuilder word = new StringBuilder();
        boolean flag = false;
        for(char ch : s.toCharArray()){
            if(ch=='(')
                flag = true;
            else if(ch==')'){
                flag = false;
                ans.append(map.containsKey(word.toString())?map.get(word.toString()):"?");
                word = new StringBuilder();
            }else if(flag)
                word.append(ch);
            else
                ans.append(ch);
        }
        return ans.toString();
    }
}