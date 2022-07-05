class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length,maxlen =0;
        int []dp = new int[n];
        for(int i =0 ;i<n;i++){
            maxlen = Math.max(maxlen,helper(nums,  i , dp));
        }
        return maxlen;
    }
    public int helper(int []nums , int idx, int[]dp){
        if(dp[idx]!=0){
            return dp[idx];
        }
        int maxLen = 1;
        for(int j = idx-1 ; j>=0;j--){
            if(nums[j]<nums[idx]){
                int recans = helper(nums,j , dp);
                maxLen = Math.max(recans+1 , maxLen);
            }
        }
        return dp[idx] = maxLen;
    }
}