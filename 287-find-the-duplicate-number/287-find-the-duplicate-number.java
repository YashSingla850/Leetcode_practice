class Solution {
    public int findDuplicate(int[] nums) {
        int ans = 0;
     HashMap<Integer,Integer>map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int key:map.keySet()){
            int freq = map.get(key);
            if(freq>1){
                ans  =  key;
            }
        }
          
        return ans;
        
           
    }
}


// class Solution {
//     public int findDuplicate(int[] nums) {
//         Map<Integer,Integer>map = new HashMap<>();
//         int ans = 0;
//         for(int i = 0 ; i<nums.length;i++){
//             int num  = nums[i];
//             if(map.containsKey(num)==true){
//                 ans =num;
//             }else{
//                 map.put(num , 1);

            
//             }
//             // return num;
            
//         }
        
//         return ans;
//     }
// }