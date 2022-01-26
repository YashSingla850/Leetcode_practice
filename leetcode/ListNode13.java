// leetcode - 121  best time to buy or sell a stock
// My code-{
    /////////////////
// class Solution {
//     public int maxProfit(int[] prices) {
//         int min = prices[0];
//         int count = 0;
    
//         for(int i =0; i<prices.length;i++){
//             if(min>prices[i]){
//                 min=prices[i];
//                 count = i;
                
//             }
//         }
         
//         int max = prices[count];
//         if(count<prices.length){
            
            
//         for(int j = count+1 ; j<prices.length ; j++){
//             if(max< prices[j]){
//                 max = prices[j];
//             }
//         }
           
            
//         }
       
//         int profit = max-min;
//         return profit;
//     }
// }


// ////////
// }


// right answer

// class Solution {
//     public int maxProfit(int[] prices) {
//         int min = Integer.MAX_VALUE;
//         int profit = 0;
//         for(int i= 0 ; i<prices.length;i++){
//             if(prices[i]<min){
//                 min = prices[i];
//             }else if(prices[i]-min>profit){
//                 profit = prices[i]-min;
//             }
//         }
//         return profit;
        
//     }
// }