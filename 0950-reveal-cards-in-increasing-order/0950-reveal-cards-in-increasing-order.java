class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        boolean s = false; // skip
        int f = 0; // filled spaces
        int n = deck.length;
        int res[] = new int [n];
        int i = 0;
        Arrays.sort(deck);
        while(f<n){
            if(!s && res[i]==0) {
                res[i] = deck[f];
                s = !s;
                f++;      
            } else if(res[i]==0) s = !s;
            i = (i+1)%n;
        }
        return res;
    }
}