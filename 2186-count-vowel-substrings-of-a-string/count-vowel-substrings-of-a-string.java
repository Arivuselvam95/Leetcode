class Solution {
    public int countVowelSubstrings(String word) {
        int count=0;
        int n = word.length();
        for(int i=0;i<n-4;i++){
            HashSet<Character> set  = new HashSet<>();
            for(int j=i;j<n;j++){
                if(word.charAt(j)=='a'||word.charAt(j)=='e'||word.charAt(j)=='i'||word.charAt(j)=='o'||word.charAt(j)=='u'){
                    set.add(word.charAt(j));
                    if(set.size()==5)
                        count++;
                }else{
                    break;
                }
            }
        }
        return count;
    }
}