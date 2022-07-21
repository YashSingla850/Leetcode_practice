class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int li =0;
        int ri = nums.length-1;
        int res = 0;
        while(li<ri){
            res += nums[ri]-nums[li];
            li++;
            ri--;
        }
        return res;
        
    }
}