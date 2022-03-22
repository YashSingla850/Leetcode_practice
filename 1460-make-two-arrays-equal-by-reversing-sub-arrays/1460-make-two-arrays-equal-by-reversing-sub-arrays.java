class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        HashMap<Integer,Integer>map = new HashMap<>();
        if(target.length!=arr.length){

            return false;
        }
        for(int val:target){
            map.put(val, map.getOrDefault(val,0)+1);
            
        }
        for(int i =0 ; i<arr.length;i++){
            if(map.containsKey(arr[i])==true){
                if(map.get(arr[i])>1){
                    int freq = map.get(arr[i]);
                    map.put(arr[i],freq-1);
                }else{
                    map.remove(arr[i]);
                }
                
            }else{
                return false;
            }
        
        }
       
         if(map.size()==0){
            return true;
        }
        return false;
    }
    
}