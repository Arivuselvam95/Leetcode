class Solution {
    public int[] searchRange(int[] nums, int target) {
        int a=-1;
        int b=-1;
        for(int i=0;i<nums.length;i++){
            if(target == nums[i]){
                a=i;
                for(int j=i;j<nums.length;j++)
                    if(j==nums.length-1 || nums[j]!=nums[j+1] ){
                        b=j;
                        return new int[]{a,b};
                    }
            }
        }
        return new int[]{a,b};
    }
}