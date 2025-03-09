class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int count = 0;
        int n = colors.length;
        int temp = 1;
        for(int i=1;i<=n-2+k;i++){
            if(colors[i%n]!=colors[(i-1+n)%n]){
                temp++;
            }else{
                temp=1;
            }
            if(temp>=k){
                count++;
                
            }
        }
        return count;
    }
}