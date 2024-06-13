class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int sum = 0;
        for(int i=0; i<seats.length; i++){
            sum = (seats[i]-students[i]>0)?sum+seats[i]-students[i]:sum+students[i]-seats[i];
        }
        return sum;
    }
}