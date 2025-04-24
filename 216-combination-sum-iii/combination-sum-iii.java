class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        HashSet<List<Integer>> result = new HashSet<>();
        findCombinations(k,n,0,1,new ArrayList<>(),result);
        return new ArrayList<>(result);
    }
    public static void findCombinations(int n, int target,int sum,int in,List<Integer> temp,HashSet<List<Integer>> result){
        if(temp.size()==n){
            if(sum==target)
                result.add(new ArrayList<>(temp));
            return;
        }
        for(int i=in;i<=9;i++){
                temp.add(i);
                findCombinations(n,target,sum+i,i+1,temp,result);
                temp.remove(temp.size()-1);
        }
    }
}