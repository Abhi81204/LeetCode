class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<students.length; i++){
            q.add(students[i]);
        }
        int i=0;
        int count=0; 
        while(q.size()>0){
            int t = q.poll();
            if(!(t==sandwiches[i]) && count<=q.size()){
                q.add(t);
                count++;
            } else if(t==sandwiches[i] && count<=q.size()){
                i++;
                count = 0;
            } else return count;
        }
        return 0;
    }
}