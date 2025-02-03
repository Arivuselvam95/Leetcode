class Solution {
    public int divisorSubstrings(int num, int k) {
        int count = 0;
        String nums = String.valueOf(num);
        for(int i=0;i<nums.length()-k+1;i++){
            int substring = Integer.valueOf(nums.substring(i,i+k));
            if(substring!=0 && num%substring==0)
                count++;
        }
        
        return count;
    }
}