class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int[] num1 : nums1){
            map.put(num1[0],num1[1]);
        }
        for(int[] num2 : nums2){
            map.put(num2[0],map.getOrDefault(num2[0],0)+num2[1]);
        }
        int n = map.size();
        int arr[][] = new int[n][2];
        int index=0;
        for(int key : map.keySet()){
            arr[index][0] = key;
            arr[index++][1] = map.get(key);
        }
        return arr;
    }
}