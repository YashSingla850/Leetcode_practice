// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine().trim();
            String[] s1 = s.split(" ");
            int[] nums = new int[n];
            for(int i = 0; i < s1.length; i++)
                nums[i] = Integer.parseInt(s1[i]);
            Solution ob = new Solution();
            int ans = ob.LongestBitonicSequence(nums);
            System.out.println(ans);           
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int LongestBitonicSequence(int[] nums)
    {
        // Code here
        int m = nums.length;
        int []lis = new int[m];
        int []lds = new int[m];
         LIS(nums , lis);
         LDS(nums , lds);
        int maxLen =0;
        for(int i=0;i<m;i++){
            maxLen = Math.max(maxLen , lis[i]+lds[i]-1);
        }
        return maxLen;
    }
    // /////////////LIS///////////////////////////////
    public static int LIS(int[]arr , int[]dp){
        int n = arr.length, maxlen =0;
        for(int i =0;i<n ;i++){
            dp[i] =1;
            for(int j =i-1;j>=0;j--){
                if(arr[j]<arr[i]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
            maxlen = Math.max(dp[i],maxlen);
        }
        return maxlen;
    }
    // ///////////////////LDS////////////////////////
       public static int LDS(int[]arr , int[]dp){
        int n = arr.length, maxlen =0;
        for(int i =n-1;i>=0 ;i--){
            dp[i] =1;
            for(int j =i+1;j<n;j++){
                if(arr[j]<arr[i]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
            maxlen = Math.max(dp[i],maxlen);
        }
        return maxlen;
    }
    
}