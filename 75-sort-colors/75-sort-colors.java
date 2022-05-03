class Solution {
    public void sortColors(int[] nums) {
        int count0 = 0 , count1 = 0, count2 =0;
        // int []ans = new int [nums.length];
        for(int i = 0; i<nums.length;i++){
            if(nums[i]==0){
                count0++;
                
            }else if(nums[i]==1){
                count1++;
            }else{
                count2++;
            }
        }
        int ycount = count0+count1;
        int kcount = count0+count1+count2;
        
        for(int i = 0;i<count0;i++){
            nums[i]=0;
            
        }
        for(int j=  count0 ; j<ycount;j++ ){
            nums[j]=1;
        }
        for(int k =ycount;k<kcount;k++){
            nums[k]=2;
        }
    }
}