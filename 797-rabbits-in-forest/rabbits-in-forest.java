class Solution {
    public int numRabbits(int[] answers) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : answers)
            map.put(i ,map.getOrDefault(i,0)+1);
        int ans = 0;
        for(int key : map.keySet()){
            ans+=((map.get(key)+key)/(key+1))*(key+1);
        }
        return ans;
    }
}