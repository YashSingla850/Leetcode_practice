class Solution {
    public int minimumLengthEncoding(String[] words) {
        HashSet<String> s1 = new HashSet<>();
        HashSet<String>s2 = new HashSet<>();
        for(String s:words){
            s1.add(s);
            s2.add(s);
        }
        
        for(String sa :s1){
            for(int i=1;i<sa.length();i++){
                String st = sa.substring(i);
                if(s2.contains(st)){
                      s2.remove(st);
                }
            }
        }
        int sum =0;
        for(String sa:s2){
            sum+=sa.length()+1;
        }
        return sum;
    }
}