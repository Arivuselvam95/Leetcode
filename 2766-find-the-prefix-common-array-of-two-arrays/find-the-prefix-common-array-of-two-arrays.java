class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int count = 0;
        int n = A.length;
        boolean[] flag = new boolean[n+1];
        int[] result = new int[n];
        for(int i=0;i<n;i++){
            if(flag[A[i]]){
                count++;
            } else {
                flag[A[i]]=true;
            }

            if(flag[B[i]]){
                count++;
            } else{
                flag[B[i]]=true;
            }
            result[i]=count;
        }
        return result;
    }
}
