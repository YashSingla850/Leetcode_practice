class Solution {
    public int[][] intervalIntersection(int[][] nums1, int[][] nums2) {
        ArrayList<int[]>list = new ArrayList<>();
        int i =0;
        int j =0;
        while(i<nums1.length&&j<nums2.length){
            int lo = Math.max(nums1[i][0],nums2[j][0]);
            
            int hi  = Math.min(nums1[i][1],nums2[j][1]);
            if(lo<=hi){
                list.add(new int[]{lo,hi});
            }
            if(nums1[i][1]<nums2[j][1]){
                i++;
            }else{
                j++;
            }
        }
        return list.toArray(new int[list.size()][2]);
    }
}