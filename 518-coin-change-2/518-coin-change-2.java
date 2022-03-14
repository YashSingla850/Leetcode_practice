class Solution {
    public int change(int amount, int[] coins) {
        int [] dp = new int[amount+1];
        dp[0] = 1;
        for(int coin:coins){

        for(int j = 0 ; j<=amount;j++){
            if(j-coin>=0){
                dp[j] += dp[j-coin];
            }
        }
        }
        return dp[amount];
        
        
    }
}