class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=bin(nums,target,0,nums.length-1);
        return n;
    }
    public int bin(int[] nums,int t,int left,int right){
        if(left>right)
            return left;
        else{
            int mid=(left+right)/2;
            if(nums[mid]==t) return mid;
            if(nums[mid]>t)
            return bin(nums,t,left,mid-1);
            else
            return bin(nums,t,mid+1,right);
        }
    }
}