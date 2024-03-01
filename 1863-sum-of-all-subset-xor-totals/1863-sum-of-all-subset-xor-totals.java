class Solution {
    public int subsetXORSum(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<(1<<n);i++){
            List<Integer> li=new ArrayList<Integer>();
            for(int j=0;j<n;j++){
                if((i&(1<<j))>=1)li.add(nums[j]);
            }
            sum+=xor(li);
        }
        return sum;
    }
    private int xor(List<Integer> n){
        int size=n.size();
        if(size==0) return 0;
        int sum=n.get(0);
        if(size>1)
        for(int i=1;i<size;i++){
            sum=sum^n.get(i);
        }
        return sum;
    }
}