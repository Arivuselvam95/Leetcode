class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        for (int i = 0, j = citations.length - 1; i < j; i++, j--) {
            int temp = citations[i];
            citations[i] = citations[j];
            citations[j] = temp;
        }
        int h=1;
        for(int i : citations){
            if(i<h)
                return h-1;
            h++;
        }
        return h-1;
    }
}