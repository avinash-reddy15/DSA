class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int size=nums.length;
        int p1,p2;
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);
        int i;
        for(i=0;i<size-2;i++){
            if(i>0 && nums[i-1]==nums[i]){continue;}
            p1=i+1;
            p2=size-1;
            while(p1<p2){
                int sum=(nums[p1]+nums[p2]+nums[i]);
                if(sum==0){
                List<Integer> a=List.of(nums[i],nums[p1],nums[p2]);
                p1++;
                while(nums[p1]==nums[p1-1] && p1<p2) p1++;
                result.add(a);

                }
                else if(sum<0){
                    p1++;
                    while(nums[p1]==nums[p1-1] && p1<p2) p1++;
                }
                else{
                    p2--;
                    while(nums[p2]==nums[p2+1] && p1<p2) p2--;
                }
            }
        }
        //if(nums[i]==0 && nums[i+1]==0 && nums[i+2]==0) result.add(List.of(0,0,0));
        return result;
    }
}