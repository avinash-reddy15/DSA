class Solution {
    public void reverseString(char[] s) {
        rev(s,0);
        
    }
    public char[] rev(char[] s,int i){
        if(i==s.length/2)
        return s;
        char temp=s[i];
        s[i]=s[s.length-1-i];
        s[s.length-1-i]=temp;
        return rev(s,++i);
    }
}