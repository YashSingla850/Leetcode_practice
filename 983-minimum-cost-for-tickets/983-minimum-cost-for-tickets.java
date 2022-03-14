class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ; i<days.length;i++){
            map.put(days[i],1);
        }
        int [] dp = new int [days[days.length-1]+1];
       for(int i = 1; i<dp.length;i++){
           if(map.containsKey(i)){
               if(i>=30){
                   dp[i] =  Math.min(dp[i-30]+costs[2],Math.min(dp[i-7]+costs[1],dp[i-1]+costs[0]));
                   
               }else if(i>=7){
                    dp[i] =  Math.min(dp[0]+costs[2] ,Math.min(dp[i-7]+costs[1],dp[i-1]+costs[0]));
                   
               }else if(i>=1){
                    dp[i] =  Math.min(dp[0]+costs[2] ,Math.min(dp[0]+costs[1],dp[i-1]+costs[0]));
                   
               }
           }else{
               dp[i]= dp[i-1];
           }
       }
        return dp[days[days.length-1]];
    }
}