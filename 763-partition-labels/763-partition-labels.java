class Solution {
    public List<Integer> partitionLabels(String s) {
        int [] map = new int[26];
        // Arrays.fill(map,-1);
        for(int i =0;i< s.length();i++){
            char ch  = s.charAt(i);
            map[ch-'a'] = i;
        }
        ArrayList<Integer>list = new ArrayList<>();
        int start =0 ,end =0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            end = Math.max(end, map[ch-'a']);
            if(i==end){
                list.add(end-start+1);
                end=start = i+1;
            }
        }
        return list;
    }
}