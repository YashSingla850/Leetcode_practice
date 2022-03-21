class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
       Set<Integer> set1 = toSet(nums1);
      Set<Integer> set2 = toSet(nums2);
    Set<Integer> set3 = toSet(nums3);
        List<Integer>res = new ArrayList<>();
        for(int j:set1){
            if(set2.contains(j)||set3.contains(j)){
                res.add(j);
            }
            
        }
        for(int k:set2){
            if(set1.contains(k)||set3.contains(k)){
                if(!res.contains(k))
                res.add(k);
            }
        }
        return res;
    }
     Set<Integer> toSet(int[] n) {
        Set<Integer> set = new HashSet<Integer>();
        for ( int i : n) {
            set.add(i);
        }
        return set;
    }
}

   
