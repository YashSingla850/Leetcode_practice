class Solution {
    public int longestCommonSubsequence(String s1, String s2) {
        int n = s1.length(), m = s2.length();
        int [][]dp = new int [n+1][m+1];
        for(int[]d:dp) Arrays.fill(d, -1);
        int ans =longestCommonSubsequence_memo(s1 ,s2, n, m, dp); 
        return ans;
    }
    public int longestCommonSubsequence_memo(String s1 ,String s2, int n , int m, int [][]dp){
          if(n==0||m==0){
               return dp[n][m] = 0;
          }
        if(dp[n][m]!= -1){
            return dp[n][m];
        }
        if(s1.charAt(n-1)==s2.charAt(m-1)){
            return dp[n][m] = longestCommonSubsequence_memo(s1,s2 , n-1,m-1,dp)+1;
        }else{
             return dp[n][m] = Math.max(longestCommonSubsequence_memo(s1,s2 , n,m-1,dp),longestCommonSubsequence_memo(s1,s2 , n-1,m,dp));
        }
        
    }
}