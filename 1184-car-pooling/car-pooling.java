class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int[] trip : trips){
            for(int i=trip[1];i<trip[2];i++){
                map.put(i,map.getOrDefault(i,0)+trip[0]);
                if(map.get(i)>capacity)
                    return false;
            }
        }
        return true;
    }
}