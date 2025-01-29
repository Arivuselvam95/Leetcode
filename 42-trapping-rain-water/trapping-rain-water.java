class Solution {
    public int trap(int[] height) {
        int ans = 0, n = height.length;
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = height[0];
        int max = height[0];
        for(int i=1;i<n;i++){
            if(max<height[i])
                max = height[i];
            left[i] = max;
        }
        right[n-1] = height[n-1];
        max = height[n-1];
        for(int i=n-2;i>=0;i--){
            if(max<height[i])
                max = height[i];
            right[i] = max;
        }
        for(int i =0 ;i<n;i++)
            ans += Math.min(left[i],right[i]) - height[i];
        return ans;
    }
}