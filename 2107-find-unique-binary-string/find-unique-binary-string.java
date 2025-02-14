class Solution {
    public String findDifferentBinaryString(String[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(String bin : nums){
            list.add(Integer.parseInt(bin,2));
        }
        int i=0;
        while(list.contains(i))
            i++;
        String ans = Integer.toBinaryString(i);
        while(nums.length!=ans.length())
            ans='0'+ans;
        return ans;
    }
}