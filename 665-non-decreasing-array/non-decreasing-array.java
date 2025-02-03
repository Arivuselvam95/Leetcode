class Solution {
    public boolean checkPossibility(int[] nums) {
        for(int i=0;i<nums.length-1;i++)
            if(nums[i]>nums[i+1]){
                if(i==0)
                    nums[i]=nums[i+1];
                else if (i!=nums.length-2 && nums[i]<nums[i+2] )
                    nums[i+1] = nums[i+2];
                else if(nums[i-1]>nums[i+1])
                    nums[i+1]=nums[i];
                else
                    nums[i] = nums[i+1];

                break;
            }
        System.out.println(Arrays.toString(nums));
        for(int i=0;i<nums.length-1;i++)
            if(nums[i]>nums[i+1])
                return false;
                
        return true;
    }
}