class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean used[] = new boolean[nums.length];
        backtrack(nums,  new ArrayList<>(),used , result);
        return result;
    }
    public static void backtrack(int[] arr,List<Integer> temp,boolean[] used, List<List<Integer>> result){
        if(temp.size()==arr.length){
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(!used[i]){
                used[i] = true;
                temp.add(arr[i]);
                backtrack(arr,temp,used,result);
                temp.remove(temp.size()-1);
                used[i] = false;
            }
        }
    }
}