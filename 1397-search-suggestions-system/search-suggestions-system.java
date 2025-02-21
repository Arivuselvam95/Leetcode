class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);
        List<List<String>> list = new ArrayList<>();
        for(int i=0;i<searchWord.length();i++){
            List<String> match = new ArrayList<>();
            String check = searchWord.substring(0,i+1);
            for(String str : products){
                if(str.startsWith(check))
                    match.add(str);
                if(match.size()==3)
                    break;
            }
           
            list.add(match);
        }
        return list;
    }
}