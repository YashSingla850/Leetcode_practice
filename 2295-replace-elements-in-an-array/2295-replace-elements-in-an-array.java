class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
         HashMap<Integer,Integer>map = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i =0;i<operations.length;i++){
            int first = operations[i][0];
            int second= operations[i][1];
            int temp = map.get(first);
            nums[temp] = second;
            map.remove(first);
            map.put(second,temp);
        }
        return nums;
        
    }
}

// class Solution {
//     public int[] arrayChange(int[] nums, int[][] operations) {
//         HashMap<Integer,Integer>map = new HashMap<>();
//         int []ans = new int [nums.length];
//         for(int i =0;i<nums.length;i++){
//             map.put(nums[i],i);
//         }
        
//         for(int i =0;i<operations.length;i++){
//                 int temp1= operations[i][0];
//             int temp2 = operations[i][1];
//             if(map.containsKey(temp1)){
//                 int freq = map.get(temp1);
//                 map.remove(temp1);
//                 map.put(temp2,freq);
//             }
//         }
            
//               for (int key: map.keySet()){
//                int freq = map.get(key);
//                 ans[freq] = key;  
//         }
         
     
        
//         return ans;
//     }
// }