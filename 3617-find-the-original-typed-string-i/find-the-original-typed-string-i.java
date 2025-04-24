class Solution {
    public int possibleStringCount(String word) {
        int ans = 0;
        char arr[] = word.toCharArray();
        int count = 1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1])
                count++;
            else{
                ans+=count-1;
                count = 1;
            }
        }
        ans+=count;
        return ans;
    }
}