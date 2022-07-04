class Solution {
    public int numDistinct(String s1, String s2) {
        int n = s1.length(), m = s2.length();
        int [][]dp = new int [n+1][m+1];
        for(int[]d:dp) Arrays.fill(d,-1);
        int ans = helper(s1,s2,n , m ,dp);
        return ans;
    }
    public int helper(String s1, String s2, int N ,int M , int[][]dp){
        for(int n =0;n<=N;n++){
              for(int m =0;m<=M;m++){
                if(m==0){
                     dp[n][m] = 1;
                    continue;
                }else if(n==0){
                     dp[n][m] =0;
                    continue;
                }
         
            if(s1.charAt(n-1)==s2.charAt(m-1)){
                dp[n][m] = dp[n-1][m-1]+dp[n-1][m];
            }else{
                 dp[n][m] = dp[n-1][m];

                }
                    
            }

           }
        return dp[N][M];
    }
    
}




// class Solution {
//     public int numDistinct(String s1, String s2) {
//         int n = s1.length(), m = s2.length();
//         int [][]dp = new int [n+1][m+1];
//         for(int[]d:dp) Arrays.fill(d,-1);
//         int ans = helper(s1,s2,n , m ,dp);
//         return ans;
//     }
//     public int helper(String s1, String s2, int n ,int m , int[][]dp){
//         if(m==0){
//             return dp[n][m] = 1;
//         }else if(n==0){
//             return dp[n][m]=0;
//         }
//       int a = helper(s1,s2, n-1 , m-1,dp);
//         int b = helper(s1 , s2 , n-1 ,m ,dp);
//         if(dp[n][m]!=-1){
//             return dp[n][m];
//         }
//         if(s1.charAt(n-1)==s2.charAt(m-1)){
//            return dp[n][m] = a+b;
//         }else{
//             return dp[n][m] = b;
//         }
//     }
    
// }