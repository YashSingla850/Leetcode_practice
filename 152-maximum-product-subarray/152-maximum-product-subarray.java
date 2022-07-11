class Solution {
    public int maxProduct(int[] nums) {
        int max = -(int)1e9;
       
        for(int i =0;i<nums.length;i++){
            int ans =nums[i];
            if(max<ans){
                max = ans;
            }
            for(int j =i+1;j<nums.length;j++){
                ans = ans*nums[j];
                if(max<ans){
                    max = ans;
                }
            }
        }
        return max;
    }
}