class Solution {
    public int removeDuplicates(int[] nums) {
        int p1=0,p2=0;
        int n=nums.length;
        while(p1<n && p2<n){
            if(nums[p1]!=nums[p2])
            nums[++p1]=nums[p2];
            p2++;
        }
        
        return p1+1;
    }
}