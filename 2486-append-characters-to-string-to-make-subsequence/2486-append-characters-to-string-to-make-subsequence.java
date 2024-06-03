class Solution {
    public int appendCharacters(String s, String t) {
        char u[] = t.toCharArray();
        int i=0;
        for(char c: s.toCharArray()){
            if(i<u.length && c==u[i]){
                i++;
            }
        }
        return t.length()-i;
    }
}