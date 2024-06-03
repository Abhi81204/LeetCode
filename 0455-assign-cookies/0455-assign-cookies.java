class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int j =0, c = 0;
        while(j<s.length && c<g.length){
            if(s[j]>=g[c]){
                c++;
            }
            j++;
        }
        return c;
    }
}