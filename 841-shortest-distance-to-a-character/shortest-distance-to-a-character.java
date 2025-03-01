class Solution {
    public int[] shortestToChar(String s, char c) {
        int n =s.length();
        int[] distance = new int[n];
        for(int index = 0;index<n;index++){
            if(s.charAt(index)!=c){
                    int i = index-1;
                    int j = index+1;
                    while(i>=0 || j<n){
                        if((i>=0 && s.charAt(i)==c )|| (j<n && s.charAt(j)==c)){
                            distance[index] = Math.min(index-i,j-index);
                            break;
                        }
                        i--;
                        j++;
                    }
                }
        }
        return distance;
    }
}