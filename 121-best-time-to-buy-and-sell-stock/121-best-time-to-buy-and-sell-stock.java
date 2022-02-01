class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0 ; i<prices.length;i++){
            if(prices[i]<min){
                min = prices[i];
            }else if(prices[i]-min>maxProfit){
                maxProfit = prices[i]-min;
            }
        }
        return maxProfit;

    }
}
//         int min = prices[0];
//         int count = 0;
    
//         for(int i =0; i<prices.length;i++){
//             if(min>prices[i]){
//                 min=prices[i];
//                 count = ;
                
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