class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        int n = nums.length;
        Set<Integer> list = new HashSet<>();
        
        for(int i=0;i<n;i++){
            if(nums[i]==key){
                    list.add(i);
                int x = i-1;
                while(x>=0 && i-x<=k){ 
                        list.add(x);
                    x--;
                }
                x=i+1;
                while(x<n && x-i<=k){ 
                        list.add(x);
                    x++;
                }
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int i : list)
            ans.add(i);
        Collections.sort(ans);
        return ans;
    }
}