class Solution {
    public String sortVowels(String s) {
        ArrayList<Character> arr = new ArrayList<>();
        for(char ch : s.toCharArray()){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                arr.add(ch);
        }
        Collections.sort(arr);
        int index = 0;
        StringBuilder ans = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                ans.append(arr.get(index++));
            else
                ans.append(ch);
        }
        return ans.toString();
    }
}