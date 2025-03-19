public class Solution {
    public int reverseBits(int n) {
        String str = Integer.toBinaryString(n);
        while(str.length()<32)
            str = '0'+str;
        char[] arr = str.toCharArray();
        int i=0,j=31;
        while(i<j){
            char temp = arr[i];
            arr[i++] = arr[j];
            arr[j--] = temp;
        } 
        i=0;
        while(i<32 && arr[i]!='1')
            i++;
        if(i==32) return 0;
        return (int) Long.parseLong(new String(arr,i,32-i),2);
    }
}