class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer>res = new ArrayList<>();
        HashSet<Integer>set1 = new HashSet<>();
        HashSet<Integer>set2 = new HashSet<>();
        HashSet<Integer>set3 = new HashSet<>();
        for(int val:nums1){
            set1.add(val);
        }
         for(int val:nums2){
            set2.add(val);
        }
         for(int val:nums3){
            set3.add(val);
        }
        for(int key:set1){
            if(set2.contains(key)||set3.contains(key)){
                res.add(key);
            }
        }
        for(int key:set2){
            if(set3.contains(key)||set1.contains(key)){
                if(!res.contains(key)){
                    res.add(key);
                }
            }
        }
        return res;
    }
}