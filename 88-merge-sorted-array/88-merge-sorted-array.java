class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pointer1 = m-1,pointer2 = n-1 , pointer3= nums1.length-1;
        while(pointer3>=0){

        int element1 , element2 ; 
            if(pointer1 >=0){

            element1 = nums1[pointer1];
            }else{

            element1 = Integer.MIN_VALUE;
            }
            if(pointer2>=0){

            element2 = nums2[pointer2];
            }else{

            element2 = Integer.MIN_VALUE;
            }
            if(element1>element2){
                nums1[pointer3] =element1;
                pointer3--;
                pointer1--;
            }else{
                nums1[pointer3]= element2;
                pointer3--;
                pointer2--;
            }
        }
        
        
    }
}