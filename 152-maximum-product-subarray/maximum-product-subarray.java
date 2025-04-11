class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0],prod =1;
        for(int i=0;i<nums.length;i++){
            prod = 1;
            for(int j=i;j<nums.length;j++){
                prod*=nums[j];
                if(prod>max) max = prod;
            }
        }
        return max;
    }
}