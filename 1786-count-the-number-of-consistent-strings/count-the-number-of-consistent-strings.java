class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        for(String word : words){
            for(int i=0;i<allowed.length();i++){
                String ch = ""+allowed.charAt(i);
                word = word.replace(ch,"");
            }
            if(word.length()==0)
                count++;
        }
        return count;
    }
}