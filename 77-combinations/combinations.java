class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        generate(n,k,new ArrayList<>(),1,result);
        return result;
    }
    public static void generate(int n, int k ,List<Integer> temp,int a, List<List<Integer>> result ){
        if(temp.size()==k){
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int i=a;i<=n;i++){
            temp.add(i);
            generate(n,k,temp,i+1,result);
            temp.remove(temp.size()-1);
        }
    }
}