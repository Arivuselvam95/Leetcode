class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n1 = s.length(), n2 = t.length();
        if(n1!=n2)
            return false;
        HashMap<Character,Character> map1 = new HashMap<>();
        HashMap<Character,Character> map2 = new HashMap<>();
        for(int i=0;i<n1;i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if(!map1.containsKey(ch1))
                map1.put(ch1,ch2);
            else{
                if(ch2!=map1.get(ch1))
                    return false;
            }
        }
        for(int i=0;i<n1;i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if(!map2.containsKey(ch2))
                map2.put(ch2,ch1);
            else{
                if(ch1!=map2.get(ch2))
                    return false;
            }
        }
        return true;
    }
}