class Solution {
    public static boolean isSymmetric(String s1,String s2){
        int sum1=0,sum2=0;
        for(char ch: s1.toCharArray()) sum1+=(ch-'0');
        for(char ch: s2.toCharArray()) sum2+=(ch-'0');
        return sum1==sum2;
    }
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int i=low;i<=high;i++){
            int n =(int) Math.log10(i)+1;
            String str = String.valueOf(i);
            if(n%2==0 && isSymmetric(str.substring(0,n/2),str.substring(n/2)))
                count++;
        }
        return count;
    }
}