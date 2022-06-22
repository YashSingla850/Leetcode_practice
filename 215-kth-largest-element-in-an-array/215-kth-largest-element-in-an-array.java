class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        int i =nums.length-1;
          while(k!=0){
              int val = nums[i];
               min = val;
              i--;
              k--;
          }
        return min;
    }
}