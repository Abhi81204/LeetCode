class Solution {
    public int strStr(String h, String n) {
        int j = 0;
        for(int i=0; i<h.length(); i++){
            if(h.charAt(i)==n.charAt(j)) j++;
            else {
                i = i-j;
                j = 0;
            };
            if(j==n.length()) return i-j+1;
        }
        return -1;
    }
}