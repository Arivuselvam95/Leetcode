class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int n = arr.length;
        if(n==1) return 1;
        int max = 1;
        char flag = 's';
        int count = 2;
        if(arr[0]>arr[1]){
            flag = 'g';
            count= 2;
        }
        else if(arr[0]==arr[1]){
            flag= 'e';
            count= 1;
        }
        for(int i=1;i<n-1;i++){
            char com = arr[i]>=arr[i+1] ?( arr[i]==arr[i+1]?'e' : 'g'): 's';
            if(com!= 'e' && flag!=com){
                count++;
            }else{
                max = Math.max(count,max);
                if(arr[i]==arr[i+1])
                    count=1;
                else
                    count = 2;
            }
            flag = com;
        }
        max = Math.max(count,max);
        return max;
    }
}