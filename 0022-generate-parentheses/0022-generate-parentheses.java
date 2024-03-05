class Solution {
    public List<String> generateParenthesis(int n) {
        return balance("(",1,0,n,new ArrayList<>());
    }
    private static List<String>  balance(String s,int n,int m,int size,List<String> list){
        if(s.length()==size*2){
            //System.out.println(s);
            list.add(s);
            return list;
        }

        if(n<size)
         balance(s+"(",n+1,m,size,list);
        if(m<n)
         balance(s+")",n,m+1,size,list);

        return list;
    }
}