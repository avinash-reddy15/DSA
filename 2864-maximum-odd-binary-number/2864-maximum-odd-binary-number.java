class Solution {
    public String maximumOddBinaryNumber(String s) {
        StringBuilder sb=new StringBuilder();
        int count=0;
        for(var c:s.toCharArray()){
            
            if(c=='1'&& count>0){
                sb.insert(0,c);
            }
            if(c=='1')count++;
            else
                sb.append(c);
        }
        sb.append('1');
        return sb.toString();
    }
}