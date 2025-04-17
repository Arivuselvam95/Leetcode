class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        if(digits.length()==0)
            return list;
        String[] letters = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        findCombination(letters, digits, 0 , new StringBuilder(),list);
        return list;
    }
    public static void findCombination(String[] buttons, String digits,int index,StringBuilder temp, List<String> list){
        if(temp.length()==digits.length()){
            list.add(temp.toString());
            return;
        }
        String key = buttons[digits.charAt(index)-'0'-2];
        for(int i=0;i<key.length();i++){
            temp.append(key.charAt(i));
            findCombination(buttons, digits, index+1, temp, list);
            temp.deleteCharAt(temp.length()-1);
        }
    }
}