//  TABULATION -:

class Solution {
    public int climbStairs(int n) {
         int []dp = new int[n+1];
        // Arrays.fill(dp , -1);
          int ans = helper(n , dp);
        return ans;
    }
    public int helper(int n , int[]dp){
       
        if(n==0){
            return dp[n] = 1;
        }
        if(dp[n]!= 0){
            return dp[n];
        }
        if(n<=1){
            return dp[n] = helper(n-1 , dp);
        }
       return dp[n] = helper(n-1 , dp)+helper(n-2,dp);
    }
    
}

// MEMOIZATION -:


// class Sol.ution {
//     public int climbStairs(int n) {
//         int []dp = new int [n+1];
//         return  climbStairs_memo(n ,dp);
//     }
//     public int climbStairs_memo(int n , int[]dp){
//        if(n<=1){
//            return dp[n] =1;
//        }
//         if(dp[n]!=0){
//             return dp[n];
//         }
//         return dp[n] = climbStairs_memo(n-1,dp)+climbStairs_memo(n-2,dp);
//     }
// }