class Solution {
    public boolean checkValidString(String s) {
        int openC = 0;
        int starC = 0;
        int closeC = 0;
        for(char c: s.toCharArray()){
            if(c=='(') openC++;
            else if(c=='*') starC++;
            else {
                if(openC>0) openC--;
                else if(starC>0) starC--;
                else return false;
            }
        }
        starC = 0;
        for(int i = s.length() - 1; i >= 0; i--){
            char c = s.charAt(i);
            if(c==')') closeC++;
            else if(c=='*') starC++;
            else {
                if(closeC>0) closeC--;
                else if(starC>0) starC--;
                else return false;
            }
        }
        return closeC<=starC;
    }
}