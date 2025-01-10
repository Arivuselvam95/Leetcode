class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int index=0;
        for(int i=0;i<s.length();i++){
            if(i==spaces[index]){
                sb.append(" ");
                if(index<spaces.length-1)
                    index++;
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}