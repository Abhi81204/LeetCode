class Solution {
    public long maximumImportance(int n, int[][] roads) {
        int[] degree = new int[n];
        for(int[] road : roads){
            degree[road[0]]++;
            degree[road[1]]++;
        }
        
        int[] freq = new int[n];
        for(int d : degree){
            freq[d]++;
        }
        
        long totalImp = 0;
        long value = 1;
        
        for(long i = 0 ; i< n ; i++){
            for(int j = 0 ; j < freq[(int)i] ; j++){
                totalImp += i* value++;
            }
        }  
        return totalImp;
    }
}