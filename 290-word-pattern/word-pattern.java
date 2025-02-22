class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split("\\s");
        HashMap<Character,String> map1 = new HashMap<>();
        HashMap<String,Character> map2 = new HashMap<>();
        int len = pattern.length();
        if(len!=arr.length)
            return false;
        for(int i=0;i<len;i++){
            char ch = pattern.charAt(i);
            if(map1.containsKey(ch)){
                if(!map1.get(ch).equals(arr[i]))
                    return false;
            }else{
                map1.put(ch,arr[i]);
            }
            if(map2.containsKey(arr[i])){
                if(!map2.get(arr[i]).equals(ch))
                    return false;
            }else{
                map2.put(arr[i],ch);
            }
        
        }
        return true;
    }
}