// leetcode 167 twosum-2
// my answer -:
// class Solution {
//     public int[] twoSum(int[] numbers, int target) {
//         for(int i = 1 ;i<=nums.length ; i++){

//         for(int j =i+1 ; j<=nums.length ; j++){
//             if(nums[i-1]+nums[j-1]==target){
//                 return IntStream.of(i,j).toArray();
                
//             }

            
//         }
//         }
//         return null;
        
//     }
// }
// the ANSWER IS CORRECT BUT THE TIME LIMIT EXCEED;

// CORRECT ANSWER-:
// class Solution {
//     public int[] twoSum(int[] numbers, int target) {
//         int lo= 0;
//         int hi = numbers.length-1;
//         int []res = new int[2];
//         while(lo<=hi){
//             if(numbers[lo]+numbers[hi]==target){
//                 res[0]=lo+1;
//                 res[1]= hi+1;
//                 return res;
//             }else if(numbers[lo]+numbers[hi]>target){
//                 hi--;
//             }else{
//                 lo++;
//             }
//         }
//         return res;
        
//     }
// }