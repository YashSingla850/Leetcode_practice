class Solution {
    public int maxProduct(int[] nums) {
        int res = Integer.MIN_VALUE;
        int prd =1;
        for(int i =0;i<nums.length;i++){
            prd = prd*nums[i];
            res = Math.max(res , prd);
            if(prd==0){
                prd =1;
            }
        }
        prd = 1;
        for(int i =nums.length-1;i>=0;i--){
            prd  = prd*nums[i];
            res =Math.max(res, prd);
            if(prd==0){
                prd =1;
            }
        }
        return res;
    }
}



// O(n) Approach -:
// class Solution {
//     public int maxProduct(int[] nums) {
//       int result = nums[0];
//         int max = nums[0];
//         int min = nums[0];
//         for(int i =1;i<nums.length;i++){
//             int curMax = max;
//          max =  Math.max(nums[i],Math.max(max*nums[i],min*nums[i]));
//             min = Math.min(nums[i],Math.min(curMax*nums[i],min*nums[i]));
//             result = Math.max(result , max);
//         }
//         return result;
//     }
// }




// BRUTE FORCE -:
// class Solution {
//     public int maxProduct(int[] nums) {
//         int max = -(int)1e9;
       
//         for(int i =0;i<nums.length;i++){
//             int ans =nums[i];
//             if(max<ans){
//                 max = ans;
//             }
//             for(int j =i+1;j<nums.length;j++){
//                 ans = ans*nums[j];
//                 if(max<ans){
//                     max = ans;
//                 }
//             }
//         }
//         return max;
//     }
// }