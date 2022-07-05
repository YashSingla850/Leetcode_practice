class Solution {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length;
        int [][]dp=  new int[n+1][m+1];
        for(int[]d:dp) Arrays.fill(d,-1);
        int ans = helper(nums1 ,nums2,n ,m, dp);
        return ans;
    }
    public int helper(int[]nums1 , int[]nums2 ,int N, int M , int[][]dp){
        for(int n =0;n<=N;n++){
            for(int m =0;m<=M;m++){
                  if(n==0||m==0){
             dp[n][m]=0;
            continue;
        }
     
         if(nums1[n-1]==nums2[m-1]){
              dp[n][m] = dp[n-1][m-1]+1;
         }else{
             dp[n][m] = Math.max(dp[n-1][m],dp[n][m-1]);
           }
         }
      }
        return dp[N][M];
    }
}







// class Solution {
//     public int maxUncrossedLines(int[] nums1, int[] nums2) {
//         int n = nums1.length, m = nums2.length;
//         int [][]dp=  new int[n+1][m+1];
//         for(int[]d:dp) Arrays.fill(d,-1);
//         int ans = helper(nums1 ,nums2,n ,m, dp);
//         return ans;
//     }
//     public int helper(int[]nums1 , int[]nums2 ,int n , int m , int[][]dp){
//         if(n==0||m==0){
//             return dp[n][m]=0;
//         }
//         int a  = helper(nums1 , nums2 , n-1,m-1 , dp);
//         int b = helper(nums1 , nums2, n-1 ,m, dp);
//         int c = helper(nums1,nums2 , n ,m-1,dp);
//          if(nums1[n-1]==nums2[m-1]){
//              return dp[n][m] = a+1;
//          }else{
//             return dp[n][m] = Math.max(b,c);
//          }
        
//     }
// }