class Solution {

    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> queue = new PriorityQueue<>();
        int count=0;
        for(int ele : nums)
            queue.offer((long)ele);

        while(queue.size()>1){
            long a = queue.poll(),b = queue.poll();
            if(a<k || b<k){
                long ans = Math.min(a,b)*2 + Math.max(a,b);
                queue.offer(ans);
                count++;         
            }else{
                break;
            }
        }
        return count;
    }
}