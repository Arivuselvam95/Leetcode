class Solution {
    public String convert(String s, int numRows) {
        StringBuilder[] arr = new StringBuilder[numRows];
        for(int i =0;i<numRows;i++){
            arr[i]=new StringBuilder();
        }
        int index = 0;
        while(index<s.length()){
            for(int i =0;i<numRows && index<s.length();i++){
                arr[i].append(s.charAt(index++));
            }
            for(int i = numRows-2;i>0 && index<s.length();i--){
                arr[i].append(s.charAt(index++));
            }
        }
        StringBuilder ans = new StringBuilder();
        for(StringBuilder str : arr)
            ans.append(str);
        
        return ans.toString();
    }
}