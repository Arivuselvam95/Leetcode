class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int total=0;
        int n = tickets.length;
        while(tickets[k]!=0){
            for(int i=0;i<n && tickets[k]!=0;i++)
                if(tickets[i]!=0){
                    total++;
                    tickets[i]--;
                }
        }
        return total;
    }
}