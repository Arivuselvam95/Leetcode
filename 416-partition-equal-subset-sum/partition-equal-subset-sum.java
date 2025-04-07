class Solution {
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i : nums) sum+=i;
        if(sum%2==1) return false;
        HashSet<Integer> set = new HashSet<>();
        set.add(0);
        for(int i : nums){
            HashSet<Integer> temp = new HashSet<>();
            for(int j : set){
                temp.add(j);
                temp.add(i+j);
            }
            set = temp;
        }
        return set.contains(sum/2);
    }
}