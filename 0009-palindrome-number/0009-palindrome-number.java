class Solution {
    public boolean isPalindrome(int x) {
        Stack<Character> stack = new Stack<>();
        String input = String.valueOf(x);
        char inputArr[] = input.toCharArray();
        for(int i=0; i<inputArr.length/2; i++){
            stack.push(inputArr[i]);
        }
        int limit = inputArr.length%2==0? inputArr.length/2: inputArr.length/2 + 1;
        for(int i=limit; i<inputArr.length; i++){
            if(!(stack.isEmpty()) && (stack.peek() == inputArr[i])){
                stack.pop();
            } else {
                stack.push(inputArr[i]);
            }
        }
        return (stack.isEmpty());
    }
}