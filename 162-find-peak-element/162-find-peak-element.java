class Solution {
    public int findPeakElement(int[] nums) {
     int ans =0;
        if(nums.length==1){
            return ans;
        }
        int j =0;
        for(int i = 1;i<nums.length;i++){
            if(i==nums.length-1){
                if(nums[j]<nums[i]){
                    ans = i;
                }
            }else if(nums[j]<nums[i]){
                  if(i+1<nums.length&&nums[i]>nums[i+1]){
                      ans = i;
                      break;
                  }
            }
            j++;
        }
        return ans;
        
    }
}