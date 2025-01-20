class Solution {
    public String thousandSeparator(int n) {
        if(n==0)
            return "0";
        Map<Integer, String> map = new HashMap<>();
        map.put( 1,"1");
        map.put( 2,"2");
        map.put( 3,"3");
        map.put( 4,"4");
        map.put( 5,"5");
        map.put( 6,"6");
        map.put( 7,"7");
        map.put( 8,"8");
        map.put( 9,"9");
        map.put( 0,"0");
        String str="";
        int c=0;
        while(n!=0){
            int l=n%10;
            if(c==3){
                str= ("." + str);
                c=0;
            }
            str= map.get(l) + str;
            n/=10;
            c++;  
        }
        
        return str;
    }
}