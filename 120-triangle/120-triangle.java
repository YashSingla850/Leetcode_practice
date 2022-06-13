class Solution {
    public int minimumTotal(List<List<Integer>> t) {
        int n = t.size();
        List<Integer> tmp = t.get(n - 1);
        for(int i = n -2;i >=0;--i){
            for(int j = 0;j <= i;++j){
                tmp.set(j,t.get(i).get(j) + Math.min(tmp.get(j),tmp.get(j + 1)));
            }
        }
        return tmp.get(0);
    }
}