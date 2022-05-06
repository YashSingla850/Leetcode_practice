class Solution {
    public int maxScore(int[] nums, int k) {
        int ans = 0;
        int tempa = 0;
        int cans = 0;
        int w = nums.length-k;
        for(int i =0;i<nums.length;i++){
            ans+= nums[i];
            if(i<w){
                tempa+=nums[i];
            }
            cans = ans-tempa;
        }
        int i = 0;
        for(int j=w;j<nums.length;j++){
            tempa+=nums[j];
            tempa-=nums[i];
            i++;
            cans= Math.max(cans,(ans-tempa));
        }
        return cans;
        
    }
}


// class Solution {
//     public int maxScore(int[] nums, int k) {
//         int max =0 , sum=0;
//         int a;
//         HashMap<Integer,Integer>map =new HashMap<>();
//         int m =0;
//         int n =nums.length-1;
//         if(nums[m]>=nums[n]){
//             a = nums[m];
            
//         }else{
//             a = nums[n];
//         }
//         sum = sum+a;
//         if(k>3){
//             for(int i = 1;i<k-2;i++){
//                 sum = sum+nums[i];
//                 map.put(nums[i],map.getOrDefault(nums[i],0)+1);
//             }
//             for(int j=0,i = k-2;i<nums.length-2;i++){
//                 sum = sum+nums[i];
//                 if(max<sum){
//                     max = sum;
//                 }
//                 map.put(nums[i],map.getOrDefault(nums[i],0)+1);
               
//                 int freq = map.get(nums[j]);
//                 if(freq==1){
//                     map.remove(nums[j]);
//                     sum = sum-nums[j];
//                 }else{
//                     map.put(nums[j],freq-1);
//                  sum = sum-nums[j];
//                 }
                
//             }
//         }else{
//             for(int i = 1;i<nums.length-2;i++){
//                 sum = sum+nums[i];
//                 if(sum>max){
//                     max = sum;
//                     return max;
//                 }
//             }
//         }
//         return max;
        
//     }
// }

// class Solution {
//     public int maxScore(int[] nums, int k) {
//         HashMap<Integer,Integer>map =new HashMap<>();
//         for(int i = 0;i<nums.length;i++){
//            map.put(nums[i],i);
//         }
//         int ans = 0;
//         int max =0;
//         int i =1;
//         int j = nums.length-2;
//         int a,b,c;
//         if(nums[0]>=nums[nums.length-1]){
//             a=nums[0];
//             ans+=a;
//         }else{
//             a = nums[nums.length-1];
//             ans+=a;
//         }
//         while(i<=j){
//             if(nums[i]>nums[j]){
                
//                 j--;
                
//             }
            
//         }
        
//     }
// }