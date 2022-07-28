class Solution {
    public int maxSubArray(int[] nums) {
        int res = Integer.MIN_VALUE;
        int sum = 0;
        for(int i= 0;i<nums.length;i++){
            if(sum<0){
                sum = nums[i];
            }else{
                sum+=nums[i];
            }
            res = Math.max(res , sum);
            
        }
        return res;
    }
}


// class Solution {
//     public int maxSubArray(int[] nums) {
        
//         int maxSum = Integer.MIN_VALUE;
//         int curSum = 0;
//         for(int i = 0; i<nums.length;i++){
//             curSum  = curSum+nums[i];
//             if(curSum>maxSum){
//                 maxSum = curSum;
                
//             }
//             if(curSum<0){
//                 curSum=0;
//             }
        
//         }
       
//         return maxSum;
        
//     }
// }