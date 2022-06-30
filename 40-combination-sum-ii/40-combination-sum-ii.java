class Solution {
    public List<List<Integer>> combinationSum2(int[] arr, int target) {
        Arrays.sort(arr);
        List<List<Integer>>ans = new ArrayList<>();
        List<Integer>tempans = new ArrayList<>();
        combination(arr,target ,0, ans ,tempans);
        return ans;
    }
    public static void combination(int[]num , int tar ,int idx ,List<List<Integer>>ans,List<Integer>tempans){
      if(tar ==0){
         List<Integer>temp = new ArrayList<>(tempans);
          ans.add(temp);
      }
        int prev = -1;
        for(int i = idx ;i<num.length;i++){
            if(num[i]!=prev && tar-num[i]>=0){
                tempans.add(num[i]);
                combination(num , tar-num[i],i+1 , ans , tempans);
                prev = num[i];
                tempans.remove(tempans.size()-1);
            }
        }
    }
}