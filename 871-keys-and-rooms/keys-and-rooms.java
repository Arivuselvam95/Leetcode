class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Queue<Integer> queue = new LinkedList<>(rooms.get(0));
        int n = rooms.size();
        boolean visited[] = new boolean[n];
        visited[0] = true;
        while(!queue.isEmpty()){
            int r = queue.poll();
            if(!visited[r]){
                visited[r] = true;
                for(int i : rooms.get(r)){
                    queue.add(i);
                }
            }
        }
        for(boolean visit : visited)
            if(!visit)
                return false;
        return true;
    }
}