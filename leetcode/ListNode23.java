// LEETCODE 414 THIRD MAXIMUM NUMBER
// class Solution {
//     public int thirdMax(int[] nums) {
//         Integer max = null;
//          Integer sec = null;
//          Integer third = null;
//         for(Integer num:nums){
//             if(num.equals(max)|| num.equals(sec)||num.equals(third))
//                 continue;
//             if(max==null||num>max){
//                 third = sec;
//                 sec = max;
//                 max = num;
//             }else if(sec==null||num>sec){
//                 third = sec;
//                 sec = num;
//             }else if(third==null||num>third){
                
//                 third = num;
//             }
//         }
//         if(third==null){
//             return max;
//         }
//         return third;
        
//     }
// }