class Solution {
    public int partitionDisjoint(int[] nums) {
        int n = nums.length;
        int []left = new int[n];
        int []right = new int[n];
        for(int i =0;i<nums.length;i++){
            if(i==0){
                left[i] = nums[i];

            }else{
            left[i] = Math.max(left[i-1],nums[i]);
            }
        }
        for(int i =nums.length-1 ;i>=0;i--){
            if(i==nums.length-1){
                right[i] = nums[i];
            }else{
            right[i] = Math.min(nums[i],right[i+1]);
            }
        }
        int ans=-1;
        for(int i =0;i<nums.length-1;i++){
            if(left[i]<=right[i+1]){
                ans = i+1;
                break;
            }
        }
        return ans;
    }
}