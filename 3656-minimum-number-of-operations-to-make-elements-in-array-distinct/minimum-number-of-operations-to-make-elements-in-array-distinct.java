class Solution {
    public int minimumOperations(int[] nums) {
        int n = nums.length;
        int visited[] = new int[101];
        for(int i = n-1;i>=0;i--){
            if(visited[nums[i]]>0)
                return i/3+1;
            visited[nums[i]]++;
        }
        return 0;
    }
}