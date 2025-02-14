class Solution {
    public int numSplits(String s) {
        int n = s.length();
        int[] left = new int[n-1];
        Set<Character> set = new HashSet<>();
        for(int i=0;i<n-1;i++){
            set.add(s.charAt(i));
            left[i] = set.size();
        }
        set = new HashSet<>();
        int count = 0;
        for(int i=n-1;i>0;i--){
            set.add(s.charAt(i));
            if(left[i-1] == set.size())
                count++;
        }
        return count;
    }
}