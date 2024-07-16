class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] totalCost = new int[n];

        totalCost[1] = cost[1];
        totalCost[0] = cost[0];

        for(int i = 2; i < n; i++){
            totalCost[i] = cost[i] + Math.min(totalCost[i-1], totalCost[i-2]);
        }
        return Math.min(totalCost[n-1], totalCost[n-2]);
    }
   
}