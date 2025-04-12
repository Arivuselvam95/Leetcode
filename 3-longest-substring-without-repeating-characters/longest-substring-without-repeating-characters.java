class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        char str[] = s.toCharArray();
        int n = str.length;
        int start = 0;
        int max = 0;
        for(int i=0;i<n;i++){
            if(!map.containsKey(str[i])){
                map.put(str[i],i);
            }
            else{
                if(start<=map.get(str[i]))
                    start = map.get(str[i])+1;
                map.put(str[i],i);
            }
            max = Math.max(i-start+1,max);
        }
        max = Math.max(n-start,max);
        return max;
    }
}