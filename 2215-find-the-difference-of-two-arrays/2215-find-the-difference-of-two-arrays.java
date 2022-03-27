class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer>set1  = new HashSet<>();
        Set<Integer>set2  = new HashSet<>();
         List<List<Integer>> res = new ArrayList<List<Integer>>();
        ArrayList<int[]>fans = new ArrayList<>();
//         set1/////////////////
        for(int i = 0 ;i<nums1.length;i++){
            set1.add(nums1[i]);
        }
//         set2//////////////////////
        for(int j =0 ; j<nums2.length;j++){
        set2.add(nums2[j]);
        }
        
       ArrayList<Integer>list1 = new ArrayList<>();
        for(int key1: set1){
            if(set2.contains(key1)==false){
                list1.add(key1);
            }
        }
    
          ArrayList<Integer>list2 = new ArrayList<>();
        for(int key2: set2){
            if(set1.contains(key2)==false){
                list2.add(key2);
            }
        }
        res.add(list1);
        res.add(list2);
        return res;
        
    }
}