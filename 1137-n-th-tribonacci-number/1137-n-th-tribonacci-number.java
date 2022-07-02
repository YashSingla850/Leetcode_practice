class Solution {
    
    public int tribonacci(int n) {
        int [] dp = new int[n+1];
        int ans  = tribonaci_memo( n, dp);
        return ans;
    }
    public static int tribonaci_memo(int N , int[]dp){
        for(int n =0;n<=N;n++){
           if(n<=2){
               dp[n] =  (n==0?0:1);
               continue;
           }
            dp[n]=  dp[n-1]+dp[n-2]+dp[n-3];
        }
        return dp[N];
    }
}


// class Solution {
//     public int triboncacci_tabu(int N , int dp[]) {
//         for(int n =0;n<=N;n++){
//              if(n<=2){
//              dp[n] = (n==0?0:1);
//                  continue;
//        }
//          dp[n] =dp[n-1]+dp[n-2]+dp[n-3];   
//  }
      
        
//         return dp[N];
//     }
    
//     public int tribonacci(int n) {
//         int []dp = new int[n+1];
//         int ans = triboncacci_tabu(n,dp);
//         return ans;
        
//     }
// }
// memoization
// class Solution {
//     public int triboncacci_memo(int n , int dp[]){
//         if(n<=2){
//             return dp[n] = (n==0?0:1);
//         }
//         if(dp[n]!=0){
//             return dp[n];
//         }
//         dp[n] =triboncacci_memo(n-1,dp)+triboncacci_memo(n-2,dp)+triboncacci_memo(n-3,dp);
//         return dp[n];
//     }
    
//     public int tribonacci(int n) {
//         int []dp = new int[n+1];
//         int ans = triboncacci_memo(n,dp);
//         return ans;
        
        
//     }
// }