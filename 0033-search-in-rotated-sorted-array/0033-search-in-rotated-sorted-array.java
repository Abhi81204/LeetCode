class Solution {
    public static int binarySearch(int[] nums, int target, int l, int h){
        while(l<=h){
            int mid=(l+h)/2;
            if(nums[mid]==target) return mid;
            if(nums[mid]>target) h=mid-1;
            else l=mid+1;
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int l =0;
        int h=nums.length-1;
        int m=-1;
        while(l<=h){
            int mid = (l+h)/2;
            if(mid<h && nums[mid] > nums[mid+1]) m=mid;
            if(mid>l && nums[mid] < nums[mid-1]) m=mid-1;
            if(nums[l]>=nums[mid]) h=mid-1;
            if(nums[l]<nums[mid]) l=mid+1;
        }
        if(m==-1) return binarySearch(nums, target, 0, nums.length-1);
        if(nums[m]==target) return m;
        if(nums[0]>target) return binarySearch(nums, target, m+1, nums.length-1);
        else return binarySearch(nums, target, 0, m-1);

    }
}