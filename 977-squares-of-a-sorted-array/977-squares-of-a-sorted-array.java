class Solution {
    public int[] sortedSquares(int[] nums) {
        int i = 0 ;
        int j = nums.length-1;
        int k = nums.length-1;
        int []ans = new int[nums.length];
         while(k>=0){
             if(Math.abs(nums[i])>Math.abs(nums[j])){
                 ans[k]=  nums[i]*nums[i];
                 k-- ;
                 i++;
             }else{
                 ans[k] = nums[j]*nums[j];
                 k--;
                 j--;
             }
         } 
       return ans;
    }
}