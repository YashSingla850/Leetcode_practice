// leetcode- stone game-4

// class Solution {
//     Boolean[] dp = new Boolean[100000+1];
//     public boolean winnerSquareGame(int n) {
//         if (dp[n]!=null){

//         return dp[n];
//         }
//         Boolean aliceWin = false;
//         for(int move =1;n>=move*move ; move++){

//         if(n-move*move==0){
//             aliceWin = true;
//             break;
//         }else{

//         aliceWin = aliceWin||!winnerSquareGame(n-move*move);
//         }
//         }
//         return dp[n] = aliceWin;
        
        
//     }
// }