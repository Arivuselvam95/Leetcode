class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        HashSet<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        generate(0,nums,new ArrayList<>(),set);
        return new ArrayList<>(set);
    }
    public static void generate(int i, int[] nums, List<Integer> temp, HashSet<List<Integer>> set){
        if(i==nums.length){
            set.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[i]);
        generate(i+1,nums,temp,set);
        temp.remove(temp.size()-1);
        generate(i+1,nums,temp,set);
    }
}