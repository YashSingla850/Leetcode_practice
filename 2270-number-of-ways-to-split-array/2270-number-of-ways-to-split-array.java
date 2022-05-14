class Solution {
    public int waysToSplitArray(int[] nums) {
        int count =0;
        long sum =0 ;
        long sSum=0 ;
        for(int i = 0;i<nums.length;i++){
            sum+=nums[i];
        }
        for(int j =0;j<nums.length-1;j++){
            sSum += nums[j];
            long temp = sum-sSum;
            if(temp<=sSum){
                count++;
            }
            
        }
        return count;
        
    }
}