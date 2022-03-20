class Solution {
    public int countHillValley(int[] nums) {
        int count  = 0 ; 
        for(int i= 1 ; i<nums.length;i++){
            for(int j= i+1;j<nums.length;j++){
                     if(nums[i]==nums[j]){
                continue;
            }

                if(nums[i-1]<nums[i]&&nums[j]<nums[i]){
                    count++;
                }else if(nums[i-1]>nums[i]&&nums[j]>nums[i]){
                    count++;
                }
                break;
            }
        }
        return count;
        
    }
}

// class Solution {
//     public int countHillValley(int[] nums) {
//         int hill = 0;
//         int valley = 0; 
        
//         for(int i = 1 ;i<nums.length ; i++){
//             int prev = i-1;
//             int next = i+1;
//             if(nums[i]!=nums[prev]&& next<nums.length &&nums[next]!=nums[i]){
//                 if(nums[i]>nums[prev]&&nums[i]>nums[next]){
//                     hill++;
//                 }else if(nums[i]<nums[prev]&&nums[i]<nums[next]){
//                     valley++;
                    
//                 }
//             }
//                 else if(  next<nums.length&& nums[i]==nums[next]){
//                      if(  nums[i]>nums[next+1]&&nums[i]>nums[prev]){
//                         hill++;
//                     }else if(nums[i]<nums[next+1]&&nums[i]<nums[prev]){
//                          valley++;
                         
//                      }else{
//                          continue;
//                      }
                    
//                 }else if(prev>=0&&nums[i]==nums[prev]){
//                     if(prev>0 && nums[i]>nums[prev-1]&&nums[i]>nums[next]){
//                         hill++;
                        
//                     }else{
//                         continue;
//                     }
                        
//                 }
                
                
                
        

        
        
//     }
//          int count = hill+valley;
//             return count;
//     }
// }