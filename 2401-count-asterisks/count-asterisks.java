class Solution {
    public int countAsterisks(String s) {
        int count = 0;
        int astr = 0;
        for(char ch : s.toCharArray()){
            if(ch=='|')
                count++;
            else if(count%2==0 && ch=='*')
                astr++;
        }
        return astr;
    }
}