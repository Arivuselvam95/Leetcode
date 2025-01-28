class Solution {
    public int passThePillow(int n, int time) {
        int quotient = time / (n -1);
        int remainder = time % (n -1);
        if(quotient%2==0)
            return remainder+1;
        return n - remainder;
    }
}