class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>ans = new ArrayList<>();
        List<Integer>tempans = new ArrayList<>();
         permutation(nums ,0, ans , tempans);
        return ans;
    }
    public static int permutation(int[] num ,int elementUsed,List<List<Integer>>ans,List<Integer>tempans){
        if(elementUsed==num.length){
            List<Integer>temp = new ArrayList<>(tempans);
            ans.add(temp);
        }
        int count =0;
        for(int i =0;i<num.length;i++){
         if(num[i]>-11){
             int val = num[i];
             num[i] = -11;
             tempans.add(val);
             count+=permutation(num , elementUsed+1,ans,tempans);
             num[i] = val;
             tempans.remove(tempans.size()-1);
         }
        }
        return count;
    }
}