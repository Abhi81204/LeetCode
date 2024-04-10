class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        boolean s = false; // skip
        int f = 0; // filled spaces
        int n = deck.length;
        int res[] = new int [n];
        int i = 0; // res index
        Arrays.sort(deck);
        while(f<n){
            if(res[i]==0) {
                if(!s) {
                    res[i] = deck[f];
                    f++;  
                }
                s = !s;
            } 
            i = (i+1)%n;
        }
        return res;
    }
}