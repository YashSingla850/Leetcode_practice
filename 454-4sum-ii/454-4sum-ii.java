class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map <Integer , Integer>map = new HashMap<>();
        for(int i :nums1){
            for(int j :nums2){
                int sum = i+j;
                map.put(-sum , map.getOrDefault(-sum,0)+1);
            }
        }
        int count = 0; 
        for(int k:nums3){
            for(int l : nums4){
                int sum = k+l;
                count+=map.getOrDefault(sum,0);
            }
        }
        return count;
        
    }
}