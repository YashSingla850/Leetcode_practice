class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
       int [] left = new int[n];
        left[0]  =1;
        for(int i =1; i<n;i++){
            left[i]= left[i-1]*nums[i-1];
        }
        int right = 1;
        for(int i=n-2 ; i>=0 ;i--){
            right = right*nums[i+1];
            left[i] = right*left[i];
                     
        }
      return left;
    }
}