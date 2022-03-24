// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
    public static void main(String args[])throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String a[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(a[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.sortingCost(N, arr));
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution{
    static int sortingCost(int N, int arr[]){
        // code here
         HashMap<Integer ,Integer>map = new HashMap<>();
        int ans=  1 ; 
        for(int i=0;i<N;i++){
            int freq = 0;
            if(map.containsKey(arr[i]-1)==true){
                 freq = map.get(arr[i]-1);
            }            
            map.put(arr[i],freq+1);
        }
        
        for(int key:map.keySet()){
            int temp = map.get(key);
            if(temp>ans){
                ans = temp;
            }
            
        }
        ans = N-ans;
        return ans;
    }
}