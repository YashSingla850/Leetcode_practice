class Solution {
    public int longestCommonSubsequence(String s1, String s2) {
        int n = s1.length(), m = s2.length();
        int [][]dp = new int [n+1][m+1];
        for(int[]d:dp) Arrays.fill(d, -1);
        int ans =longestCommonSubsequence_memo(s1 ,s2, n, m, dp); 
        display2D(dp);
        return ans;
        
    }
      public int longestCommonSubsequence_memo(String s1 ,String s2, int N , int M, int [][]dp){
          for(int n =0;n<=N;n++){
            for(int m= 0;m<=M;m++){
              if(n==0||m==0){
                dp[n][m] = 0;
              continue;
              }

            if(s1.charAt(n-1)==s2.charAt(m-1)){
                 dp[n][m] = dp[n-1][m-1]+1;
            }else{
                 dp[n][m] = Math.max(dp[n][m-1] ,dp[n-1][m]);
            }

            }
          }
            return  dp[N][M];
        
        
    }
//     public int longestCommonSubsequence_memo(String s1 ,String s2, int n , int m, int [][]dp){
//           if(n==0||m==0){
//                return dp[n][m] = 0;
//           }
//         if(dp[n][m]!= -1){
//             return dp[n][m];
//         }
//         if(s1.charAt(n-1)==s2.charAt(m-1)){
//             return dp[n][m] = longestCommonSubsequence_memo(s1,s2 , n-1,m-1,dp)+1;
//         }else{
//              return dp[n][m] = Math.max(longestCommonSubsequence_memo(s1,s2 , n,m-1,dp),longestCommonSubsequence_memo(s1,s2 , n-1,m,dp));
//         }
        
//     }
    public void display1D(int[]dp){
        for(int ele:dp){
            System.out.print(ele + " ");
        }
         System.out.println();
   }
    public void display2D(int[][]dp){
             for(int[]d:dp){
                 display1D(d);
                 // System.out.println();
             }
    }
}