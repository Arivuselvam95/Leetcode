class Solution {
    public int matrixSum(int[][] nums) {
        int n = nums.length;
        PriorityQueue[] queue = new  PriorityQueue[n];
        for(int i=0;i<n;i++){
            queue[i] = new PriorityQueue<Integer>(Collections.reverseOrder());
            for(int j=0;j<nums[i].length;j++)
                queue[i].offer(nums[i][j]);
        }
        int sum =0;
        for(int i=0;i<nums[0].length;i++){
            int max = (int) queue[0].poll();
            for(int j=1;j<n;j++){
                int a = (int)queue[j].poll();
                max = max < a ? a : max;
            }
            sum+=max;
        }
        return sum;
    }
}