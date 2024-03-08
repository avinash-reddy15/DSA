class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] a=new int[101];
        int max=1;
        int count=0;
        for(var i:nums){
            a[i]++;
            if(a[i]==max)count++;
            if(a[i]>max){
                max=a[i];
                count=1;
            }
        }
        return max*count;
    }
}