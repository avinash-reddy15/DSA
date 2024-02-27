class Solution {
    public int maxArea(int[] height) {
        int h1,h2,max=0;
        int p1=0;
        int p2=height.length-1;
        int space,mm;
        while(p1<p2){
            space=p2-p1;
            h1=height[p1];
            h2=height[p2];
            mm=Math.min(h1,h2);
            max=Math.max(max,space*mm);
            if(h1<h2) p1++;
            else p2--;


        }
        return max;
        
    }
}