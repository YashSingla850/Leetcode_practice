class Solution {
    public double myPow(double x, int n) {
        long l = Math.abs((long)n);
        double ans = 1;
        while(l>0){
            if((l&1)==1)
                ans*=x;
            x *= x;
            l>>=1;
        }
        return n<0?1/ans:ans;
        
    }
}