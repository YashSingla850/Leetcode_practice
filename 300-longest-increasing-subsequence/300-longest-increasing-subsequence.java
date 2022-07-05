class Solution {
    public int lengthOfLIS(int[] nums) {
        int []dp = new int[nums.length];
        int ans = helper(nums, dp);
        return ans;
       
    }
    public int helper(int []nums , int[]dp){
       int n = nums.length, maxLen =0;
        for(int i = 0;i<n;i++){
            dp[i] = 1;
            for(int j =i-1;j>=0;j--){
                if(nums[j]<nums[i]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
            maxLen  = Math.max(maxLen,dp[i]);
        }
        return maxLen;
    }
}




// class Solution {
//     public int lengthOfLIS(int[] nums) {
//         int n = nums.length,maxlen =0;
//         int []dp = new int[n];
//         for(int i =0 ;i<n;i++){
//             maxlen = Math.max(maxlen,helper(nums,  i , dp));
//         }
//         return maxlen;
//     }
//     public int helper(int []nums , int idx, int[]dp){
//         if(dp[idx]!=0){
//             return dp[idx];
//         }
//         int maxLen = 1;
//         for(int j = idx-1 ; j>=0;j--){
//             if(nums[j]<nums[idx]){
//                 int recans = helper(nums,j , dp);
//                 maxLen = Math.max(recans+1 , maxLen);
//             }
//         }
//         return dp[idx] = maxLen;
//     }
// }