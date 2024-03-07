class Solution {
    public int strStr(String haystack, String needle) {
        int neddle_length=needle.length();
        int haystack_length=haystack.length();
        int n=haystack_length-neddle_length;
        for(int i=0;i<=n;i++){
            if(needle.compareTo(haystack.substring(i,(i+neddle_length)))==0){
                return i;
            }
        }
    return -1;
        
    }
}