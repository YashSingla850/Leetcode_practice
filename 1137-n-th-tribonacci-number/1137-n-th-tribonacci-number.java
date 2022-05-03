class Solution {
    public int triboncacci_memo(int n , int dp[]){
        if(n<=2){
            return dp[n] = (n==0?0:1);
        }
        if(dp[n]!=0){
            return dp[n];
        }
        dp[n] =triboncacci_memo(n-1,dp)+triboncacci_memo(n-2,dp)+triboncacci_memo(n-3,dp);
        return dp[n];
    }
    
    public int tribonacci(int n) {
        int []dp = new int[n+1];
        int ans = triboncacci_memo(n,dp);
        return ans;
        
        
    }
}