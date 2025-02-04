class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int ele : nums)
            map.put(ele,map.getOrDefault(ele,0)+1);
        Arrays.sort(nums);            
        for(int num : nums){
            if(map.get(num) > 0){
                for(int i = num+1;i<num+k;i++){
                    if(map.getOrDefault(i,0)==0)
                        return false;
                    map.put(i,map.get(i)-1);
                }
                map.put(num, map.get(num)-1);
            }
        }
        return true;
    }
}