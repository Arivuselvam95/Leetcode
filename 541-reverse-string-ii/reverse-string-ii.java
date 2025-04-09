class Solution {
    public String reverseStr(String s, int k) {
        char str[] = s.toCharArray();
        int n = str.length;
        for(int i=0;i<n;i+=2*k){
            int x = i;
            int y = i+k-1 < n ? i+k-1 : n-1;
            while(x<y){
                char temp = str[x];
                str[x] = str[y];
                str[y] = temp;
                x++;
                y--;
            }
        }
        return new String(str);
    }
}