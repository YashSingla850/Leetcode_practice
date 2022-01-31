class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer>pmap = new HashMap<>();
        for(int i = 0 ; i<nums.length ; i++){
        int val  = nums[i];
            if(pmap.containsKey(val)==false){
                pmap.put(val, 1);
                
            }else{
                // int of = fmap.get(val);
                // int nf = of+1;
                // fmap.put(val, nf)
                return true;
            }
                
        }
        // for(int i= 0 ; i<pmap)
      return false;
    }
}
  // Arrays.sort(nums);
  //       for(int i= 0 ; i<nums.length;i++){
  //           if(i+1<nums.length && nums[i]==nums[i+1]){
  //               return true;
  //           }
  //       }
  //       return false;