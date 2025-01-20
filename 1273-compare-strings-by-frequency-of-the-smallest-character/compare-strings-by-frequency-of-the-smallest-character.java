class Solution {
    private int freq(String str){
        char[] chArr= str.toCharArray();
        Arrays.sort(chArr);
        int count=1;
        char ch = chArr[0];
        for(int i=1;i<chArr.length;i++)
            if(ch==chArr[i]){
                count++;
            }else{
                break;
            }
        return count;
    }
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int arr[] = new int[queries.length];
        int i=0;
        for(String q : queries){
            int f = freq(q);
            for(String w : words){
                int wf = freq(w);
                if(wf>f)
                    arr[i]++;
            }
            i++;
        }
        return arr;
    }
}