class Solution {
    public int maxRotateFunction(int[] nums) {
        int sum  =0 , sumSf = 0  , maxSum=0;
        for(int i =0;i<nums.length;i++){
              sum +=nums[i];
            sumSf += i*nums[i];
    
        }
        maxSum = sumSf;
        for(int i =0;i<nums.length;i++){
            sumSf = sumSf-sum + nums.length*nums[i];
            maxSum = Math.max(sumSf , maxSum);
        }
        return maxSum;
    }
}