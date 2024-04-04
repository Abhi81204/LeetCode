class Solution {
    public int romanToInt(String s) {
        char inputArr[] = s.toCharArray();
        HashMap <Character, Integer> hashmap = new HashMap <>();
        hashmap.put('I', 1);
        hashmap.put('V', 5);
        hashmap.put('X', 10);
        hashmap.put('L', 50);
        hashmap.put('C', 100);
        hashmap.put('D', 500);
        hashmap.put('M', 1000);
        int temp;
        int next;
        int sum =0;
        for(int i=0; i<inputArr.length - 1; i++){
            temp = hashmap.get(inputArr[i]);
            next = hashmap.get(inputArr[i+1]);
            if (next <= temp) {
              sum = sum + temp;  
            } else {
                sum = sum - temp;
            }
        }
        sum += hashmap.get(inputArr[inputArr.length - 1]);
        return sum;

        
    }
}