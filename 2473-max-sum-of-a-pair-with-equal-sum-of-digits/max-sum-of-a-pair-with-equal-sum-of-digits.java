class Solution {
    private int digitSum(int n){
        int sum=0;
        while(n>0){
            sum+=(n%10);
            n/=10;
        }
        return sum;
    }
    public int maximumSum(int[] nums) {
        HashMap<Integer, PriorityQueue<Integer>> table = new HashMap<>();
        for(int ele : nums){
            int sum = digitSum(ele);
            table.putIfAbsent(sum, new PriorityQueue<>(Collections.reverseOrder()));
            table.get(sum).offer(ele);
        }

        long max = -1;
        for(PriorityQueue<Integer> queue : table.values()){
            if(queue.size()>1){
                long m = queue.poll()+queue.poll();
                max = max < m ? m : max;
            }
        }
        return (int)max;
    }
}