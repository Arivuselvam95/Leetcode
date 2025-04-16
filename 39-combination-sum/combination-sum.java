class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        solve(candidates,0,new ArrayList<>(),0,result,target);
        return result;
    }
    public static void solve(int[] arr,int index,List<Integer> temp,int sum, List<List<Integer>> result ,int target){
        if(index>arr.length-1)
            return;
        if(sum==target){
            result.add(new ArrayList<>(temp));
            return;
        }
        if(sum+arr[index]<=target){
            temp.add(arr[index]);
            solve(arr,index,temp,sum+arr[index],result,target);
            temp.remove(temp.size()-1);
        }
        solve(arr,index+1,temp,sum,result,target);
    }
}