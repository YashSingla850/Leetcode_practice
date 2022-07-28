class Solution {
    public String pushDominoes(String s) {
        s = "L"+s+"R";
        char []arr = s.toCharArray();
        int pi =0;
        for(int i =1;i<arr.length;i++){
            if(arr[i]=='L'){
                if(arr[pi]=='L'){
                    for(int j = pi+1;j<i;j++){
                        arr[j] = 'L';
                    }
                }else if(arr[pi]=='R'){
                    int left = pi+1;
                    int right=  i-1;
                    while(left<right){
                        arr[left] = 'R';
                        arr[right] = 'L';
                        left++;
                        right--;
                     }
                }
                pi =i;
            }else if(arr[i]=='R'){
                if(arr[pi]=='L'){
                    
                }else if(arr[pi]=='R'){
                     for(int j = pi+1;j<i;j++){
                        arr[j] = 'R';
                    }
                }
                pi =i;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i =1;i<arr.length-1;i++){
            sb.append(arr[i]);
        }
        return sb.toString();
        
    }
}