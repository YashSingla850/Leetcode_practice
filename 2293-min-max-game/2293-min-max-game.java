class Solution {
    public int minMaxGame(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        while(nums.length!=1){
        int n =nums.length;
        int [] temp = new int[n/2]; 
        
        for(int j=0 ,i =0 ;i<n-1;i+=2,j++){
            if(j%2==0){
                temp[j] = Math.min(nums[i],nums[i+1]); 
                
            }else{
                temp[j] = Math.max(nums[i],nums[i+1]);
               
            }
            
        }
        nums = Arrays.copyOf(temp,n/2);
            
    }
        return nums[0];
 }
}