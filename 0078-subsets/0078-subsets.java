class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        var result=new ArrayList<List<Integer>>();
        int size=nums.length;
        for(int i=0;i<(1<<size);i++){
            var l=new ArrayList<Integer>();
            for(int j=0;j<size;j++){
                if((i&(1<<j))>=1)l.add(nums[j]);
                //if((boolean) i & (1<<j) )l.add(nums[j]);
            }
            result.add(l);
        }
        return result;
    }
}