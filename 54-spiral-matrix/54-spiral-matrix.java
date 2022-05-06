class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>list = new ArrayList<>();
        int minr = 0;
        int maxr = matrix.length-1;
        int minc = 0;
        int maxc= matrix[0].length-1;
        
        int n = matrix.length;
        int m = matrix[0].length;
        int ml = n*m;
int count = 0;
        while(count<ml){
            //         hwall
            for(int j =minc ;j<=maxc &&count<n*m;j++ ){
                list.add(matrix[minr][j]);
                count++;
            }
            minr++;
//             rightwall
            for(int i= minr;i<=maxr&& count<n*m;i++){
                list.add(matrix[i][maxc]);
                count++;
            }
            maxc--;
//             bottom wall
            for(int j=maxc;j>=minc && count<n*m;j--){
                list.add(matrix[maxr][j]);
                count++;
                
            }
            maxr--;
//             leftwall
            for(int i = maxr;i>=minr&& count<n*m;i--){
                list.add(matrix[i][minc]);
                count++;
            }
            minc++;
        }
        return list;
        
    
        
    }
}



//         for(int i = 0;i<matrix.length;i++){
//             if(i%2==0){
//                 for(int j=matrix[i].length-1;j>0;j--){
//                     list.add(matrix[i][j]);
//                 }

//             }else{
//                 for(int j=0;j<matrix[i].length-1;j++){
//                     list.add(matrix[i][j]);
//                 }
                
//             }
//         }
//         return list;