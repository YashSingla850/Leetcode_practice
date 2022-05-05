class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int sum = 0; 
        int count = 0;
        HashMap<Integer,Integer>map = new HashMap<>();
        
        map.put(sum,1);
        for(int i = 0;i<nums.length;i++){
            sum = sum+=nums[i];
            int temp = sum%k;
            if(temp<0){
                temp+=k;
            }
            if(map.containsKey(temp)==true){
                int freq = map.get(temp);
                count = count+freq;    
               
                 map.put(temp,freq+1);
            }else{
                map.put(temp,1);

            }
            
        }
        
        // for(int key:map.keySet()){
        //     int freq = map.get(key);
        //     if(freq>1){
        //         count =count+freq-1;
        //     }
        // }
        return count;
    }
}


// class Solution {
//     public int subarraysDivByK(int[] nums, int k) {
//         int sum = 0 , count = 0;
//         HashMap<Integer,Integer>map = new HashMap<>();
//         map.put(0,1);
//         for(int i=0;i<nums.length;i++){
//             sum+=nums[i];
//             map.put(sum,map.getOrDefault(sum,0)+1);
//         }
//         for(int val:nums){
//             int temp = val%k;
//             if(temp<0){
//                 temp+=k;
//             }
//             if(map.containsKey(temp)){
//                 int freq =map.get(temp);
//                 count+=freq;
//                 map.put(temp,freq+1);
//             }else{
//                 map.put(temp,1);
//             }
//         }
//         return count;
        
//     }
// }
// failed solution
// class Solution {
//     public int subarraysDivByK(int[] nums, int k) {
//         HashMap<Integer,Integer>map = new HashMap<>();
//         int count = 0; 
//         int ans=  0;
//         map.put(0,1);
        
//          for(int i = 0;i<nums.length;i++){
//              map.put(nums[i],map.getOrDefault(nums[i],0)+1);
//          }
//         for(int val:nums){
//             ans+=val;
//             int temp = ans%k;
        
//            if(map.containsKey(k-temp)==true){
//                 count++;
//             }else{

//             map.put(ans,map.getOrDefault(ans,0)+1);
//             }
//         }
//         return count++;
//     }
// }