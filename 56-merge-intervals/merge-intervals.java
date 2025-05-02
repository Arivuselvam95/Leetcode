class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));
        int start = intervals[0][0];
        int end = intervals[0][1];
        ArrayList<int[]> list = new ArrayList<>();
        for(int i=0;i<intervals.length-1;i++){
            if(end >= intervals[i+1][0]){
                if(end < intervals[i+1][1])
                    end = intervals[i+1][1];
            }else{
                list.add(new int[]{start,end});
                start = intervals[i+1][0];
                end = intervals[i+1][1];
            }
        }
        list.add(new int[]{start,end});
        int[][] result = new int[list.size()][2];
        for(int i=0;i<list.size();i++){
            result[i] = list.get(i);
        }
        return result;
    }
}