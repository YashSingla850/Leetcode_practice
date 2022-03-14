class Solution {
    public int change(int amount, int[] coins) {
        int [] dp = new int[amount+1];
        dp[0] = 1;
        for(int coin:coins){

        for(int subAmount = 0 ; subAmount<=amount;subAmount++){
            if(subAmount-coin>=0){
                dp[subAmount] =dp[subAmount]+ dp[subAmount-coin];
            }
        }
        }
        return dp[amount];
        
        
    }
}