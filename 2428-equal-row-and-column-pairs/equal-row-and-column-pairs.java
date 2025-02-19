class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        int count=0;
        Map<String ,Integer> map =  new HashMap<>();
        for(int i=0;i<n;i++){
            String str="";
            for(int j=0;j<n;j++){
                str+="["+grid[i][j]+"]";
            }
            map.put(str,map.getOrDefault(str,0)+1);
        }
        for(int i=0;i<n;i++){
            String str="";
            for(int j=0;j<n;j++){
                str+="["+grid[j][i]+"]";
            }
            count+=map.getOrDefault(str,0);
        }
        return count;
    }
}