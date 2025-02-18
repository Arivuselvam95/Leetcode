class Solution {
    public int maxVowels(String s, int k) {
       
        String substring = s.substring(0,k);
        int len = substring.length();
        substring = substring.replaceAll("[aeiou]","");
        int max = len-substring.length();
        int ans = max;
        for(int i=1;i<=s.length()-k;i++){
            char ch = s.charAt(i-1);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                ans--;
            
            ch = s.charAt(i+k-1);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                ans++;
            
            max = max<ans ? ans:max; 
        }
        return max;
    }
}