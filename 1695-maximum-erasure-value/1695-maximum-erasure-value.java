class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashMap<Integer,Integer>map = new HashMap<>();
        int max =0;
        int sum =0;
        int j=0;
        for(int i =0;i<nums.length;i++){
            if(map.containsKey(nums[i])==false){
                map.put(nums[i],i);
                sum = sum+nums[i];
                if(max<sum){
                    max = sum;
                }
            }else{
                int freq = map.get(nums[i]);
                // map.put(nums[i],i)
                 while(j<=freq){
                     sum = sum-nums[j];
                     map.remove(nums[j]);
                     j++;
                 }
                  map.put(nums[i],i);
                     sum = sum+nums[i];
                  if(max<sum){
                      max = sum;
                  }
            }
        }
        return max;
    }
}