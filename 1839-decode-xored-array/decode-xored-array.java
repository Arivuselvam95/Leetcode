class Solution {
    public int[] decode(int[] encoded, int first) {
        int n = encoded.length;
        int[] arr = new int[n+1];
        arr[0] = first;
        for(int i=0;i<n;i++){
            // int ans = 0;
            // while(true){
            //     if( (arr[i]^ans) == encoded[i]){
            //         arr[i+1] = ans;
            //         break;
            //     }
            //     ans++;
            // }
            arr[i+1] = encoded[i] ^ arr[i];
        }
        return arr;
    }
}