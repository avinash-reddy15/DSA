class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> repeated=new HashSet<>();
        int addingPointer=0;
        int removingPointer=0;
        int size=s.length();
        if(size==0)return 0;
        int sum=0,result=1;
        while(addingPointer<size){
            char c=s.charAt(addingPointer);
            if(!repeated.contains(c)){
                repeated.add(c);
                //addingPointer++;
            }
            else{
                while(repeated.contains(c)){
                    repeated.remove(s.charAt(removingPointer));
                    removingPointer++;
                }

                //removingPointer++;
                repeated.add(c);

            }
            result=Math.max(result,addingPointer-removingPointer+1);
            addingPointer++;
        }
        return result;
        
    }
}