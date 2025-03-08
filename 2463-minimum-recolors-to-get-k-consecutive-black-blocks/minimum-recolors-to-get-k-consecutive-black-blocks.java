class Solution {
    public static int recolor(String str){
        int b = str.replace("B","").length();
        return b;
    }
    public int minimumRecolors(String blocks, int k) {
        int min = blocks.length();
        for(int i=0;i<=blocks.length()-k;i++){
            min = Math.min(recolor(blocks.substring(i,i+k)),min);
        }
        return min;
    }
}