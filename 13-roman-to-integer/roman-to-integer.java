class Solution {
    int value(char ch){
        if(ch=='I')
            return 1;
        if(ch=='V')
            return 5;
        if(ch=='X')
            return 10;
        if(ch=='L')
            return 50;
        if(ch=='C')
            return 100;
        if(ch=='D')
            return 500;
        if(ch=='M')
            return 1000;
        return 0;
    }
    public int romanToInt(String s) {
        int ans=0;
        for(int i=s.length()-1;i>=0;i--){
            if(4*value(s.charAt(i))<ans)
                ans-=value(s.charAt(i));
            else
                ans+=value(s.charAt(i));
        }
        return ans;
    }
}