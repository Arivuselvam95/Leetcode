class Solution {
    public long maximumTripletValue(int[] nums) {
        long ans = 0;
        int n = nums.length;
        if(nums.length==3){
            ans = (long)(nums[0]-nums[1])*nums[2];
            // System.out.println(ans);
            return ans<0?0:ans;
        }
        long[] leftmax = new long[n];
        long[] rightmax = new long[n];
        leftmax[0] = nums[0];
        for(int i=1;i<n;i++)
            leftmax[i] = Math.max(leftmax[i-1],nums[i]);
        rightmax[n-1] = nums[n-1];
        for(int i=n-2;i>=0;i--)
            rightmax[i] = Math.max(rightmax[i+1],nums[i]);
        // System.out.println(Arrays.toString(rightmax));
        for(int i=1;i<n-1;i++){
            ans = Math.max(ans,(leftmax[i-1]-nums[i])*rightmax[i+1]);
        }
        return ans;
    }
}