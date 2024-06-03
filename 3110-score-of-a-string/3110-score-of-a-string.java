class Solution {
    public int scoreOfString(String s) {
        int sum = 0;
        for(int j=0; j<s.length()-1; j++){
            char c = s.charAt(j);
            char d = s.charAt(j+1);
            int i = c;
            int k = d;
            sum += Math.abs(i-k);
        }
        return sum;
    }
}