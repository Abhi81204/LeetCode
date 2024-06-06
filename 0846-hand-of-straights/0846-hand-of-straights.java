class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length%groupSize!=0) return false;
        Arrays.sort(hand);
        for(int i=0; i<hand.length; i++){
if (hand[i] >= 0) {
                if (!findsuccessors(hand, groupSize, i))
                    return false;
            }
        }
        return true;
    }
    public boolean findsuccessors(int[] hand, int groupSize, int i){
        int check = hand[i]+1;
        hand[i] = -1;
        i += 1;
        int count = 1;
            while(i<hand.length && count<groupSize){
                if(check==hand[i]){
                    check = hand[i]+1;
                    hand[i] = -1;
                    count++;
                }
                i++;
            }
        if(count!=groupSize) return false;
        else return true;
    }
}

