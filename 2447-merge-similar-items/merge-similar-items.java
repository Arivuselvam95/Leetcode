class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int[] item : items1)
            map.put(item[0],item[1]);
        for(int[] item : items2)
            map.put(item[0],map.getOrDefault(item[0],0)+item[1]);

        List<List<Integer>> list = new ArrayList<>();
        for(int key: map.keySet()){
            List<Integer> l = new ArrayList<>();
            l.add(key);
            l.add(map.get(key));
            list.add(l);
        }
        Collections.sort(list,(a,b)->Integer.compare(a.get(0),b.get(0)));
        return list;
    }
}