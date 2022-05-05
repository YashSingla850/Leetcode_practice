class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> threePairs = new HashSet();
       
        Arrays.sort(nums);
        // for(int i =0;i<nums.length;i++){
        //     map.put(nums[i],i);
        // }
        for(int i = 0;i<nums.length-1;i++){
             HashMap<Integer,Integer>map = new HashMap<>();
            for(int j = i+1;j<nums.length;j++){
                int temp = -(nums[i]+nums[j]); 
                if(map.containsKey(temp)==true){
                    int freq = map.get(temp);
                    if(freq==i||freq==j){
                         continue;
                        
                    }else{
                             List<Integer> list = new ArrayList();
                        list.add(nums[i]);
                        list.add(temp);
                        list.add(nums[j]);
                        threePairs.add(list);
                    }
                }else{
                    map.put(nums[j],j);
                }

            }
        }
        List<List<Integer>> threeSum = new ArrayList();
        threeSum.addAll(threePairs);
        return threeSum;
        
    }
}