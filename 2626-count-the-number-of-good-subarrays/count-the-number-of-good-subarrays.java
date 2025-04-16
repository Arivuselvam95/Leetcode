class Solution {
    public long countGood(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int left = 0;
        long ans = 0;
        long count = 0;
        int n = nums.length;
        for(int right = 0;right<n;right++){
            int val = nums[right];
            count+=map.getOrDefault(val,0);
            map.put(val,map.getOrDefault(val,0)+1);
            while(count>=k){
                ans += n - right;
                int remove = nums[left];
                map.put(remove,map.get(remove)-1);
                count -= map.get(remove);
                left++;
            }
        }
        return ans;
    }
}