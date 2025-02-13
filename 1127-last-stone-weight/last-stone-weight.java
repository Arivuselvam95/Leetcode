class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for(int stone : stones)
            queue.offer(stone);
        while(queue.size()>1){
            int a= queue.poll(), b= queue.poll();
            if(a!=b)
                queue.offer(a-b);
        }
        return queue.isEmpty() ? 0 : queue.poll();
    }
}