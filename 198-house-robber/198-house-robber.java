class Solution {
    public int rob(int[] nums) {
        int n= nums.length;
        
        int dp [] = new int [n+1];
        Arrays.fill(dp,-1);
        return helper(nums , n-1 , dp);
    }
    public int helper(int[]nums , int N, int []dp){
        for(int n =0;n<=N;n++){
        if(n==0){
            dp[n] =   nums[n];
            continue;
        }
        // if(n<0){ 
        //     dp[n] = 0;
        // }
        // if(dp[n]!=0)return dp[n];
        int pick = dp[n-1];
        int dpick = nums[n];
            if(n>1){
                dpick+=dp[n-2];
            }
          dp[n] = Math.max(pick , dpick);
         
        }
        return dp[N];
    }
}

// MEMOIZATION

// class Solution {
//     public int rob(int[] nums) {
//         int n= nums.length;
        
//         int dp [] = new int [n+1];
//         Arrays.fill(dp,-1);
//         return helper(nums , n-1 , dp);
//     }
//     public int helper(int[]nums , int n, int []dp){
//         if(n==0){
//             return  nums[n];
//         }
//         if(n<0){ 
//             return 0;
//         }
//         if(dp[n]!=-1)return dp[n];
//         int pick = helper(nums ,n-1 ,dp );
//         int dpick = helper(nums, n-2 ,dp)+nums[n];
         
//         return dp[n] = Math.max(pick , dpick);
//     }
// }