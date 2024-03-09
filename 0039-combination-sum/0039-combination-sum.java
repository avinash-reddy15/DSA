class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        combiSum(candidates,target,0,new HashSet<List<Integer>>() ,new ArrayList<Integer>());
        return result;
    }
    List<List<Integer>> result=new ArrayList<>();
    public void combiSum(int[] candidates,int target,int sum,Set<List<Integer>> set,List<Integer> list){
        if(sum>=target){
            List<Integer> tempList=new ArrayList<>(list);
            Collections.sort(tempList);
            if(sum==target && !set.contains(tempList)){
                result.add(tempList);
                set.add(tempList);
                System.out.println(result);
            }
            return;
        }

        for(int i=0;i<candidates.length;i++){
            list.add(candidates[i]);
            combiSum(candidates,target,sum+candidates[i],set,list);
            list.remove(list.size()-1);
        }
    }
}