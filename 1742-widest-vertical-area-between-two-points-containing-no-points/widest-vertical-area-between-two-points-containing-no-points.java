class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, (a,b) -> Integer.compare(a[0],b[0]));
        int max = 0;
        for(int i=0;i<points.length-1;i++)
            max = max < points[i+1][0] - points[i][0] ? points[i+1][0] - points[i][0] : max;
        return max;
    }
}