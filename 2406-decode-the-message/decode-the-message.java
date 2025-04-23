class Solution {
    public String decodeMessage(String key, String message) {
        Map<Character,Character> map = new HashMap<>();
        int i = 0;
        for(char ch : key.toCharArray()){
            if(ch!=' '){
                if(!map.containsKey(ch))
                    map.put(ch,(char)('a'+i++));
            }
        }
        map.put(' ',' ');
        StringBuilder ans = new StringBuilder();
        for(char ch : message.toCharArray())
            ans.append(map.get(ch));
        return ans.toString();
    }
}