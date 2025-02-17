class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int[] ans = new int[n];
        int i=0;
        for(int ele1: nums1){
            int max=-1;
            boolean flag = false;
            for(int ele2 : nums2){
                if(ele1==ele2)
                    flag = true;
                if(flag && ele2>ele1){
                   
                    max = ele2;
                    break;
                }
            }
             ans[i++] = max;
        }
        return ans;
    }
}