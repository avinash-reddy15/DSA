class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Map<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<stones.length();i++){
            char c=stones.charAt(i);
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        int sum=0;
        for(char c:jewels.toCharArray()){
            sum+=hm.getOrDefault(c,0);
        }
        return sum;
    }
}