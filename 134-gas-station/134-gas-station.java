class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
    int csum = 0;
        int osum =0;
        int si =0;
        for(int i =0;i<gas.length;i++){
            int delta = gas[i]-cost[i];
            csum +=delta;
            osum+=delta;
            if(csum<0){
                csum =0;
                si =i+1;
            }
        }
        if(osum>=0){
            return si;
        }
        return -1;
    }
}

// class Solution {
//     public int canCompleteCircuit(int[] gas, int[] cost) {
//         int n = gas.length;
//         int total_gas = 0;
//         int left_gas = 0;
//         int start_point = 0;
//         for(int i=0 ; i<n;i++){
//             total_gas+=gas[i]-cost[i];
//             left_gas+=gas[i]-cost[i];
//             if(left_gas<0){

//             left_gas=0;
//                 start_point = i+1;
                
//             }
//         }
//         return(total_gas<0)?-1:start_point;
        
//     }
// }