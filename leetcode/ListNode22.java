// LEETCODE 219 CONTAI DUPLICATE;

// MY SOLUTION TIMElIMITEXCEED
// class Solution {
//     public boolean containsNearbyDuplicate(int[] nums, int k) {
//         int n = nums.length;
//         for(int i= 0; i<n;i++){

//         for(int j = i+1;j<n;j++){
//             if(nums[i]==nums[j]){
//                 if(Math.abs(i-j)<=k){
//                     return true;
//                 }
//             }
//         }
//         }
//         return false;
        
//     }
// }

// CorrectAnswer-:

// class Solution {
//     public boolean containsNearbyDuplicate(int[] nums, int k) {
//         HashMap<Integer, Integer> map = new HashMap<>();
//         for(int i=0; i<nums.length; i++) {
//             int ithValue = nums[i];
//             if(map.containsKey(ithValue) && Math.abs(map.get(ithValue)-i) <= k) {
//                 return true;
//             } else {
//                 map.put(ithValue, i);
//             }
//         }
//         return false;
//     }
// }
