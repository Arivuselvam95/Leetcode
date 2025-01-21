class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length,n = matrix[0].length;
        Queue<Integer> iQueue = new LinkedList<>();
        Queue<Integer> jQueue = new LinkedList<>();
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                if(matrix[i][j]==0){
                    if(!iQueue.contains(i))
                        iQueue.offer(i);
                    if(!jQueue.contains(j))
                        jQueue.offer(j);
                }
        while(!iQueue.isEmpty()){
            int i=iQueue.poll();
            for(int j=0;j<n;j++)
                matrix[i][j]=0;
        }
        while(!jQueue.isEmpty()){
            int j=jQueue.poll();
            for(int i=0;i<m;i++)
                matrix[i][j]=0;
        }
    }
}