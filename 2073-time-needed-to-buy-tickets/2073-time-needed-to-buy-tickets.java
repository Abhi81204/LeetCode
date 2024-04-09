class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int count = 0;
        for(int i=0; i<tickets.length; i++){
            if(tickets[i]<tickets[k]) {
                count += tickets[i];
            } else if(i<=k) {
                count += tickets[k];
            } else {
                count += tickets[k]-1;
            }
        }
        return count;
    }
}