class Solution {
    public int trap(int[] nums) {
        int n = nums.length;
        int []left = new int [n];
        int []right = new int[n];
        for(int i =0;i<n;i++){
            if(i==0){
                left[i]= nums[i];  
            }else{
                left[i] = Math.max(left[i-1],nums[i]);
            }
        }
          for(int i =n-1;i>=0;i--){
            if(i==n-1){
                right[i]= nums[i];  
            }else{
                right[i] = Math.max(right[i+1],nums[i]);
            }
        }
        int val =0;
        for(int i =0;i<n;i++){
            val+=Math.min(left[i],right[i])-nums[i];
        }
        return val;
    }
}