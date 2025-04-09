class Solution {
    public int repeatedStringMatch(String a, String b) {
        if(a.length()> b.length())
            if(a.contains(b))
                return 1;
            else if((a+a).contains(b))
                return 2;
            else
                return -1;
        
        int count = 1;
        String s = "";
        while(count<=(b.length()/a.length())+2){
            s = a.repeat(count);
            if(s.contains(b)){
                return count;
            }
            count++;
        }
        return -1;
    }
}