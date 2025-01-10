class Solution {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        int arr[] = {-1,-1};
        for(int i=0;i<nums.length-indexDifference;i++){
            for(int j=i+indexDifference;j<nums.length;j++){
                if(Math.abs(nums[i]-nums[j])>=valueDifference){
                    arr[0]=i;
                    arr[1]=j;
                    return arr;
                }
            }
        }
        return arr;
    }
}