// TIME LIMIT EXCEED RECURSIVE CODE
// class Solution {
//     public int change(int amount, int[] coins) {
//         return ch(amount , coins ,0);
        
//     }
//     public static int ch(int target, int[]coins , int idx){
//         if(target==0){
          
//            return 1;
//         }
//         int count =0;
//         for(int i = idx;i<coins.length;i++){
//             if(target-coins[i]>=0){
//                 count+=ch(target-coins[i],coins,i);
                
//             }
            
//         }
//         return count;
//     }
// }






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