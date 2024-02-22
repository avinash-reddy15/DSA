class Solution {
    public int findJudge(int n, int[][] trust) {
        if(trust.length==0 && n==1)return 1;
        Map<Integer,Integer> hm=new HashMap<>();
        Set<Integer> s=new HashSet<>();
        for(int[] a:trust){
            
                hm.put(a[1],hm.getOrDefault(a[1],0)+1);
                s.add(a[0]);
            
            // hm.put(a[1],hm.getOrDefault(a[1],0)+1);
        }
          List<Integer> li=new ArrayList<>(hm.keySet());
        //     for(int i=1;i<li.size();i++)
        //     if(li.get(i)!=li.get(i-1))
        //     return -1;
            
        // return li.get(0);
        for(int i=0;i<hm.size();i++){
            int m=li.get(i);
            if(hm.get(m)==n-1 && !s.contains(m))
            return li.get(i);
        }
        return -1;
    }
}