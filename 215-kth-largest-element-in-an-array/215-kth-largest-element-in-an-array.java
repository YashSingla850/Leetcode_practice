class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        for(int i =nums.length-1,j=0;j<k;j++,i--){
            if(min>nums[i]){
                min =nums[i];
            }
        }
        return min;
    }
}