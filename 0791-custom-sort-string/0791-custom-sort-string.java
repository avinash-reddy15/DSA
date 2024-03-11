class Solution {
    public String customSortString(String order, String s) {
        int[] arr=new int[26];
        int num=1;
        for(int c:order.toCharArray()){
            arr[c-'a']=num;
            num++;
        }
        //char[] chr=s.toCharArray();
        String sortedString = s.chars()                               // Get IntStream of characters
                                    .mapToObj(c -> (char) c)             // Convert to Stream<Character>
                                    .sorted((a, b) -> arr[a - 'a'] - arr[b - 'a']) // Sort using custom comparator
                                    .map(Object::toString)               // Convert characters to Strings
                                    .collect(Collectors.joining());
        return sortedString;        
    }
}