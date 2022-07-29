class Solution {
    public int maxSumTwoNoOverlap(int[] nums, int fl, int sl) {
        int max1 = max(nums , fl , sl);
        int max2  = max(nums , sl ,fl);
        return Math.max(max1 , max2);
    }
    public int max(int[]nums , int fl  , int sl){
        int []left = new int[nums.length];
        int []right = new int[nums.length];
        int sum =0;
        for(int i =0;i<nums.length;i++){
            sum +=nums[i];
            if(i==fl-1){
                left[i] = sum;
            }else if(i>=fl){
                sum = sum-nums[i-fl];
                left[i] = Math.max(sum , left[i-1]);
            }
        }
        sum =0;
        for(int i =nums.length-1;i>=0;i--){
          sum+=nums[i];
            if(i==nums.length-sl){
                  right[i]=sum;
            }else if(i<nums.length-sl){
                sum -=nums[i+sl];
                right[i] = Math.max(sum , right[i+1]);
            }
        }
        int max  = Integer.MIN_VALUE;
        for(int i = fl-1 ; i<nums.length-sl;i++){
            max = Math.max(max, left[i]+right[i+1]);
        }
        return max;
    }
}