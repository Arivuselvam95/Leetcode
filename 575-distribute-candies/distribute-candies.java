class Solution {
    public int distributeCandies(int[] candyType) {
        int count = 1;
        int n = candyType.length;
        Arrays.sort(candyType);
        for(int i=1;i<n;i++)
            if(candyType[i]!=candyType[i-1])
                count++;
        return count > n/2 ? n/2 : count; 
    }
}