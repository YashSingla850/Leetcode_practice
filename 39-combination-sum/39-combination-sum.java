class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>ans = new ArrayList<>();
        List<Integer>tempans = new ArrayList<>();
        combination(candidates,target,0,ans , tempans);
        return ans;
    }
    
    public static void combination(int[]num ,int target,int idx , List<List<Integer>>ans,List<Integer>tempans){
        if(target==0){
        List<Integer>temp = new ArrayList<>(tempans);
            ans.add(temp);
            
        }
        for(int i=idx;i<num.length;i++){
            if(target-num[i]>=0){
                tempans.add(num[i]);
                combination(num , target-num[i], i ,ans ,tempans);
                tempans.remove(tempans.size()-1);
            }
        }
        
    }
}