class Solution {
    public static int beauty(String str , int i, int j){
        int freq[] = new int[26];
        int max = 0;
        int min = Integer.MAX_VALUE;
        for(int x = i;x<=j;x++){
            int index = str.charAt(x)-'a';
            freq[index]++;
        }
        for(int x : freq){
            max = Math.max(max,x);
            if(x!=0) min = Math.min(min,x);
        }
        return max - min;
    }
    public int beautySum(String s) {
        int count = 0;
        int n = s.length();
        for(int i=0;i<n;i++)
            for(int j=i+1;j<n;j++)
                count+=beauty(s,i,j);
        return count;
    }
}