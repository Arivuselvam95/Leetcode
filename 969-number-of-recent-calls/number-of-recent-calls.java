class RecentCounter {
    Queue<Integer> queue ;
    public RecentCounter() {
        queue = new LinkedList<>();
    }
    
    public int ping(int t) {
        queue.add(t);
        int count=0;
        for(int i : queue){
            if(i<=t && i>=t-3000)
                count++;
        }
        return count;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */