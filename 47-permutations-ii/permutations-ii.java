class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        boolean used[] = new boolean[nums.length];
        permute(nums,new ArrayList<>(),used,set);
        return new ArrayList<>(set);
    }
    public static void permute(int[] nums,List<Integer> temp,boolean[] used,Set<List<Integer>> set){
        if(temp.size()==nums.length){
            set.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!used[i]){
                used[i] = true;
                temp.add(nums[i]);
                permute(nums,temp,used,set);
                temp.remove(temp.size()-1);
                used[i] = false;
            }
        }
    } 
}