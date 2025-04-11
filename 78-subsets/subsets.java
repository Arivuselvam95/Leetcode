class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        findSubsets(0,nums,new ArrayList<>(),result);
        return result;
    }
    public static void findSubsets(int index,int[] nums,List<Integer> temp, List<List<Integer>> result){
        if(index==nums.length){
            result.add(new ArrayList<>(temp));
            return;
        }else{
            temp.add(nums[index]);
            findSubsets(index+1,nums,temp,result);
            temp.remove(temp.size()-1);
            findSubsets(index+1,nums,temp,result);
        }
    }
}