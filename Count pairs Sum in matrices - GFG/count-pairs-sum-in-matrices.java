// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String input[] = read.readLine().split(" ");
            
            int n = Integer.parseInt(input[0]);
            int x = Integer.parseInt(input[1]);
            
            int mat1[][] = new int[n][n];
            
            for(int i = 0;i<n;i++){
                input = read.readLine().split(" ");
                for(int j = 0;j<n;j++){
                    mat1[i][j] = Integer.parseInt(input[j]);
                }
            }
            
            int mat2[][] = new int[n][n];
            
            for(int i = 0;i<n;i++){
                input = read.readLine().split(" ");
                for(int j = 0;j<n;j++){
                    mat2[i][j] = Integer.parseInt(input[j]);
                }
            }
            
        
            
            Solution ob = new Solution();
            System.out.println(ob.countPairs(mat1,mat2,n,x));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    int countPairs(int mat1[][], int mat2[][], int n, int x) {
     Set<Integer>set1 = new HashSet <> (); 
     Set<Integer>set2 = new HashSet<>(); 
     int count= 0;
     for(int i = 0;i<mat1.length;i++){
         for(int j=0;j<mat1[i].length;j++){
             set1.add(mat1[i][j]);
         }
     }
      for(int i = 0;i<mat2.length;i++){
         for(int j=0;j<mat2[i].length;j++){
             set2.add(mat2[i][j]);
             }
         }
         for(int key : set1){
             if(set2.contains(x-key))
             count++;
         }
         return count;
     }
    
}