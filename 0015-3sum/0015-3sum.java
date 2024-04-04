import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        if(nums[0] > 0) return res;
        int sum, j, k;
        for(int i=0; i<nums.length-2; i++){
            if(i >0 && nums[i] == nums[i-1]) continue;
            sum = -nums[i];
            j = i+1;
            k = nums.length-1;
            while(j<k){
                if(sum == nums[j]+nums[k]){
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    while (j < k && nums[j] == nums[j + 1]) j++; 
                    while (j < k && nums[k] == nums[k - 1]) k--;
                    j++;
                    k--;
                }
                else if(sum < nums[j] + nums[k]) k--;
                else j++;
            }
        }
        return res;
    }
}