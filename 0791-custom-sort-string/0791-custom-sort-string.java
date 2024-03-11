class Solution {
    public String customSortString(String order, String s) {
        int[] arr=new int[26];
        int num=1;
        for(int c:order.toCharArray()){
            arr[c-'a']=num;
            num++;
        }
        //char[] chr=s.toCharArray();
        String sortedString = s.chars()                               
                                    .mapToObj(c -> (char) c)             
                                    .sorted((a, b) -> arr[a - 'a'] - arr[b - 'a']) 
                                    .collect(StringBuilder::new, StringBuilder::append,
                                    StringBuilder::append)
                                    .toString();
        return sortedString;        
    }
}