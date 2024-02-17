class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk=new Stack<>();
        //int j=-1;
        char[] carr=new char[s.length()];
        for(char c:s.toCharArray()){
            if( c=='('|| c=='{' ||c=='[')
            stk.push(c);
            else{
                if(stk.size()==0)return false;
                char top=stk.pop();
                if(c==')' && top!='(' ||c=='}'&& top!='{' || c==']'&& top!='[') return false;
                
            }
            
        }
        
        return stk.isEmpty();
        
    }
}