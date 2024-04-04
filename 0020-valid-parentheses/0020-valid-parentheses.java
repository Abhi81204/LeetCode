class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        char a[] = s.toCharArray();
        for(int i=0; i<a.length; i++){
            if(a[i] == '(' || a[i] == '{' || a[i] == '[' ) st.push(a[i]);
            else if(!st.isEmpty()) {
                if(a[i] == ')' && st.peek() == '(' || a[i] == '}' && st.peek() == '{' || a[i] == ']' && st.peek() == '[') st.pop();
                else return false;
            }
            else return false;
        }
        return st.isEmpty();
    }
}