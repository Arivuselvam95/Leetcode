class Solution {
    public boolean checkDistances(String s, int[] distance) {
        int[] dist = new int[26];
        for(int i=0;i<s.length();i++){
            int index = s.charAt(i)-'a';
            if(dist[index]==0)
                dist[index] = i+1;
            else
                dist[index] = i - dist[index];
        }
        for(int i=0;i<s.length();i++){
            int index = s.charAt(i)-'a';
            if(dist[index]!=distance[index])
                return false;
        }
        
        return true;
    }
}