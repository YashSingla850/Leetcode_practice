//  TABULATION -:

class Solution {
    public int climbStairs(int n) {
         int []dp = new int[n+1];
        // Arrays.fill(dp , -1);
          int ans = helper(n , dp);
        return ans;
    }
    public int helper(int N , int[]dp){
       for(int n = 0;n<=N;n++){
              if(n==0){
            dp[n] = 1;
            continue;
        }
        
        if(n<=1){
             dp[n] = dp[n-1];
        }else{
            dp[n] = dp[n-1]+dp[n-2] ;
        }
          
       }
     return dp[N];
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