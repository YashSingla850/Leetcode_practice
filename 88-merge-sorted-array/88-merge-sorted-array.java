class Solution {
public void merge(int[] nums1, int m, int[] nums2, int n) {
       int k = m+n-1;
       while(m>0&&n>0){
          if(nums2[n-1]>nums1[m-1]){
              nums1[k] = nums2[n-1];
              n--;
          }else if(nums1[m-1]>=nums2[n-1]){
              nums1[k] = nums1[m-1];
              m--;
          }
           k--;
       }
          while (n > 0) {
            nums1[k] = nums2[n - 1];
            n--;
            k--;
          }
    }
    
}































//         int last = m + n - 1;

//         while (n > 0 && m > 0) {

//             if (nums2[n - 1] >= nums1[m - 1]) {
//                 nums1[last] = nums2[n - 1];
//                 n--;
//             } else {
//                 nums1[last] = nums1[m - 1];
//                 m--;
//             }
//             last--;
//         }

//         while (n > 0) {
//             nums1[last] = nums2[n - 1];
//             n--;
//             last--;
//         }
        






























// class Solution {
//     public void merge(int[] nums1, int m, int[] nums2, int n) {
//         int pointer1 = m-1,pointer2 = n-1 , pointer3= nums1.length-1;
//         while(pointer3>=0){

//         int element1 , element2 ; 
//             if(pointer1 >=0){

//             element1 = nums1[pointer1];
//             }else{

//             element1 = Integer.MIN_VALUE;
//             }
//             if(pointer2>=0){

//             element2 = nums2[pointer2];
//             }else{

//             element2 = Integer.MIN_VALUE;
//             }
//             if(element1>element2){
//                 nums1[pointer3] =element1;
//                 pointer3--;
//                 pointer1--;
//             }else{
//                 nums1[pointer3]= element2;
//                 pointer3--;
//                 pointer2--;
//             }
//         }
        
        
//     }
// }