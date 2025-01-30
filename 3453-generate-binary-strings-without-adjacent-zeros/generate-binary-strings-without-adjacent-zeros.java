class Solution {
    public List<String> validStrings(int n) {
        List<String> list = new ArrayList<>();
        for(int i=0;i<Math.pow(2,n);i++){
            String ans = Integer.toBinaryString(i);
            while(ans.length()<n)
                ans= '0'+ans;
            if(!ans.contains("00"))
                list.add(ans);
        }
        return list;
    }
}