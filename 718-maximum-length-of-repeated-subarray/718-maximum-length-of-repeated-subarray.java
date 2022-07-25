// class Solution {
//     public int findLength(int[] nums1, int[] nums2) {
//         int n=  nums1.length , m = nums2.length;
//         int[][] dp = new int [n][m];
//         for(int [] d: dp)Arrays.fill(d,-1);
//            int ans =  helper(nums1 , nums2 , n-1 , m-1 , dp);
//         return ans;
//     }
//     public int helper(int[]nums1  , int []nums2 , int n, int m, int[][]dp){
//         if(n ==0  || m==0){
//             return dp[n][m] =0;
//         }
//         if(dp[n][m]!=-1)return dp[n][m];
//         int a = helper(nums1, nums2 , n-1, m-1, dp);
//         int b = helper(nums1, nums2 , n-1, m, dp);
//         int c = helper(nums1, nums2 , n, m-1, dp);
//         int max = -(int)1e9;
//         if(nums1[n]==nums2[m]){
//             return dp[n][m] = a+1;
//     }else{
//         return dp[n][m] = Math.max(b,c);
//     } 
//     }
// }

class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int n=  nums1.length , m = nums2.length;
        int[][] dp = new int [n+1][m+1];
        // for(int [] d: dp)Arrays.fill(d,-1);
        int ans =0;
            for(int i =n-1;i>=0;i--){
                for(int j = m-1 ;j>=0;j--){
                    if(nums1[i]==nums2[j]){
                        dp[i][j] = dp[i+1][j+1]+1;
                        if(ans<dp[i][j])ans = dp[i][j];
                    }
                }
            } 
        return ans;
    }
}















