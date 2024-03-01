class Solution {
    public boolean isPowerOfFour(int n) {
        int flag=1;
        for(int i=0;i<32;i+=2)
        if((1<<i)==n)return true;
        return false;
    }
}