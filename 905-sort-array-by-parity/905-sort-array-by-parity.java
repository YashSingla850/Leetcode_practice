class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i =0 ,j =0;
        // int []ans = new int[nums.length];
        while(i<nums.length){
           if(nums[i]%2==0){
              int temp = nums[j];
               nums[j] = nums[i];
               nums[i] = temp;
               i++;
               j++;
        }else{
               i++;
           }
            
    }
        return nums; 
  }
}