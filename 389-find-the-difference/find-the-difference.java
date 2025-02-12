class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)+1);
        }
        map.put(t.charAt(t.length()-1),map.getOrDefault(t.charAt(t.length()-1),0)+1);
        for(char ch : t.toCharArray() )
            if(map.get(ch)%2==1)
                return ch;
        return 'a';
    }
}