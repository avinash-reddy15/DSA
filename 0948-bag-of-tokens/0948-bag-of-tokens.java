class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int score=0;
        Arrays.sort(tokens);
        int p1=0,p2=tokens.length-1;
        if(p2==-1)return 0;
        if(tokens[p1]>power)return 0;
        if(tokens.length==1)return tokens[0]>power? 0: 1;
        int p=score;
        while(p1<=p2){
            
            if(tokens[p1]<=power){
            power=power-tokens[p1];
            p1+=1;
            score+=1;
            }
            else if(score>=1){
                power+=tokens[p2];
                p2-=1;
                score-=1;
            }
            else{
                return p;
            }
            p=Math.max(score,p);
        }
        return p;
    }
}