class Solution {
    public int compress(char[] chars) {
        int len = 0;
        int count=1;
        int index=0;
        for(int i = 1; i< chars.length; i++){
            if(chars[i]==chars[i-1])
                count++;
            else{
                chars[index] = chars[i-1];
                index++;
                if(count!= 1){
                    for(char ch : String.valueOf(count).toCharArray()){
                        chars[index] = ch;
                        index++;
                    }
                }
                count=1;
            }
        }
        chars[index] = chars[chars.length-1];
        index++;
        if(count!= 1){
            for(char ch : String.valueOf(count).toCharArray()){
                chars[index] = ch;
                index++;
            }
        }
        return index;
    }
}