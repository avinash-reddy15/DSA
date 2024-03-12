class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        combiSum(candidates,target,0,new HashSet<List<Integer>>() ,new ArrayList<Integer>(),0);
        return result;
    }
    List<List<Integer>> result=new ArrayList<>();
    public void combiSum(int[] candidates,int target,int sum,Set<List<Integer>> set,List<Integer> list,int index){
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

        for(int i=index;i<candidates.length;i++){
            list.add(candidates[i]);
            combiSum(candidates,target,sum+candidates[i],set,list,i+1);
            while(i<candidates.length-1 && list.get(list.size()-1)==candidates[i+1])i++;
            list.remove(list.size()-1);
        }
    }
}