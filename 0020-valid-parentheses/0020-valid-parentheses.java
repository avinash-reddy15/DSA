class Solution {
    public boolean isValid(String s) {
        
        int j=-1;
        char[] carr=new char[s.length()];
        for(char c:s.toCharArray()){
            if( c=='('|| c=='{' ||c=='[')
            carr[++j]=c;
            else{
                if(j<0)return false;
                if(c==')' && carr[j]!='(' ||c=='}'&& carr[j]!='{' || c==']'&& carr[j]!='[') return false;
                else
                --j;
            }
            
        }
        if(j==-1)
        return true;
        return false;
        
    }
}