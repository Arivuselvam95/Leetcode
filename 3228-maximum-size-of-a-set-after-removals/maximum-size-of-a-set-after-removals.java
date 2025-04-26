class Solution {
    public int maximumSetSize(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int n: nums1) set1.add(n);
        for(int n: nums2) set2.add(n);
        int common = 0;
        for(int i: set1)
            if(set2.contains(i))
                common++;
        
        int n1 = set1.size()-common;
        int n2 = set2.size()-common;
        int n = nums1.length;

        if(n1>=n/2 && n2>=n/2) return n;

        if(n1<n/2 && n2<n/2) return Math.min(n,n1+n2+common);

        if(n1<n/2) return Math.min(n/2,n1+common)+n/2;

        return Math.min(n/2,n2+common)+n/2;
    }
}