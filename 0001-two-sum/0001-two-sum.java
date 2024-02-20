class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hm=new HashMap<>();
        int a=0,b=0;
        for(int i=0;i<nums.length;i++){
            int n=target-nums[i];
            if(hm.containsKey(n)){
                a=hm.get(n);
                b=i;
                return new int[]{a,b};
            }
            hm.put(nums[i],i);
            
        }
        return new int[]{a,b};
    }
}