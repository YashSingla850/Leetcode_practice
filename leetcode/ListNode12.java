// leetcode 941 - mountain array
// class Solution {
//     public boolean validMountainArray(int[] arr) {
        
//         int l = arr.length;
//         if(l<3){
//             return false;
//         }
//         int i = 0 ,j= l-1;
//         while(i+1<l &&arr[i]<arr[i+1]){
//             i++;
//         }
//         while( j>0&&arr[j-1]>arr[j]){
//             j--;
//         }
//         if(i>0&&j<l-1){
//             if(i==j){
//                 return true;
//             }
//         }
//         return false;
        
//     }
// }