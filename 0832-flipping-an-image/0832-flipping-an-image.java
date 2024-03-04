class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n=image.length;
        int m=image[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m/2;j++){
                int temp=image[i][m-j-1];
                image[i][m-j-1]=image[i][j]==0?1:0;
                image[i][j]=temp==0?1:0;
            }
            if(m%2!=0)image[i][m/2]=image[i][m/2]==0?1:0;
        }

        return image;
    }
}