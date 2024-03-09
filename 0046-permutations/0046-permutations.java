class Solution {
    public List<List<Integer>> permute(int[] nums) {
        backtrack(nums,0,new ArrayList<>());
        return result;
    }
    List<List<Integer>> result=new ArrayList<>();
    public void backtrack(int[] nums,int index,List<Integer> processedList){
        if(index==nums.length){
            result.add(new ArrayList<>(processedList));
            return;
        }
        int ele=nums[index];
        for(int i=0;i<=processedList.size();i++){
            List<Integer> copy=new ArrayList<>(processedList);//if we dont make a copy ,we get error due to iterator by using subList()
            copy.add(i,ele);
            backtrack(nums,index+1,copy);
        }
    }
}