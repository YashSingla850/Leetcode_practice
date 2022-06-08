class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // double ans = 0.0;
        int n = nums1.length+ nums2.length;
        int [] temp = new int[n];
        int i =0;
        int j =0;
        int k =0;
           while(i<nums1.length&&j<nums2.length){
            if(nums1[i]<=nums2[j]){
                temp[k] = nums1[i];
                i++;
            }else{
                temp[k] = nums2[j];
                j++;
             }
               k++;
           }
        while(i<nums1.length){
            temp[k] =nums1[i];
            k++;
            i++;
        }
          while(j<nums2.length){
            temp[k] =nums2[j];
            k++;
            j++;
        }
     if((n)%2!=0)return (double)temp[(n)/2];
      return (double)(temp[(n)/2]+temp[(n)/2-1])/2;   
    }
}
