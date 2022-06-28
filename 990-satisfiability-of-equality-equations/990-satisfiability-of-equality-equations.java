class Solution {
    public boolean equationsPossible(String[] equations) {
        rank = new int[26];
        parent  = new int[26];
        for(int i =0;i<26;i++){
            parent[i] =i;
            rank[i] =0;
        }
        for(String equation:equations){
            if(equation.charAt(1)== '='){
                int op1 = equation.charAt(0)-'a';
                int op2  = equation.charAt(3)-'a';
                  int lead1 = find(op1);
                  int lead2  = find(op2);
                if(lead1!=lead2){
                  union(lead1 , lead2);
                    
                }
            }
        }
        
          for(String equation:equations){
            if(equation.charAt(1)== '!'){
                int op1 = equation.charAt(0)-'a';
                int op2  = equation.charAt(3)-'a';
                  int lead1 = find(op1);
                  int lead2  = find(op2);
                if(lead1 ==lead2){
                   return false;
                    
                }
            }
        }
        return true;
    }
    int []rank;
    int [] parent;
     
    int find(int x){
        if(parent[x]==x){
          return parent[x];
        }else{
            parent[x] = find(parent[x]);
                return parent[x];
        }
    }
    void union(int x , int y){
        if(rank[x]<rank[y]){
            parent[x] =y;
        }else if(rank[x]>rank[y]){
            parent[y] = x;

        }else{
            parent[x] =y;
            rank[y]++;
        }
    }
    
}