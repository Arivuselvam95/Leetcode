class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int index = n-2;
        while(index>=0 && nums[index]>=nums[index+1])
                index--;    
        if(index>=0){
            int j=n-1;
            while(nums[j]<=nums[index])
                j--;
            int temp = nums[index];
            nums[index] = nums[j];
            nums[j] = temp;
        }
        index++;
        int j = n-1;
        while(index<j){
            int temp = nums[index];
            nums[index] = nums[j];
            nums[j] = temp;
            index++;
            j--;
        }
    }
}