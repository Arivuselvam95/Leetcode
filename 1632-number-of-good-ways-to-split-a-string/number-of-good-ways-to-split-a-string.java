class Solution {
    public int numSplits(String s) {
        int n = s.length();
        int[] left = new int[n-1];
        int[] right = new int[n-1];
        Set<Character> set = new HashSet<>();
        for(int i=0;i<n-1;i++){
            set.add(s.charAt(i));
            left[i] = set.size();
        }
        set = new HashSet<>();
        for(int i=n-1;i>0;i--){
            set.add(s.charAt(i));
            right[i-1] = set.size();
        }
        int count = 0;
        for(int i=0;i<n-1;i++)
            if(left[i]==right[i])
                count++;
        return count;
    }
}