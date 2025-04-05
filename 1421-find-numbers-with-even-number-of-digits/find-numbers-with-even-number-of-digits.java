class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i : nums){
            if(String.valueOf(i).length()%2==0) count++;
        }
        return count;
    }
}