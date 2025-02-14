class Solution {
    static HashMap<Integer,Integer> map;
    
    public static int common(){
        int count = 0;
        for(int i : map.keySet()){
            count+=(map.get(i)/2);
        }
        return count;
    }
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n=A.length;
        int arr[] = new int[n];
        map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(A[i],map.getOrDefault(A[i],0)+1);
            map.put(B[i],map.getOrDefault(B[i],0)+1);
            arr[i] = common();
        }
        return arr;
    }
}