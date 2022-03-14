// { Driver Code Starts
//Initial Template for Java



//Initial Template for Java



import java.io.*;
import java.util.*;


 // } Driver Code Ends
//User function Template for Java



class Solution
{
    long subCount(long arr[] ,int n,int k)
    {
          Long ans =0L;
	    Long sum = 0L;
	    HashMap <Long , Long>map = new HashMap<>();
	    
	    map.put(sum,1L);
	    for(Long val:arr){
	        Long temp = 0L;
	        sum+=val;
	         temp  = sum%k;
	        if(temp<0){
	            temp+=k;
	        }
	        
	        if(map.containsKey(temp)){
	            ans+=map.get(temp%k);
	            
	            
	        }if(map.containsKey(temp)){
	            map.put(temp ,map.get(temp)+1);
	        }
	        
	        else{
	            map.put(temp,1L);
	        }
	    }
	    return ans;
        
        
    }
}


// { Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main (String[] args) throws IOException{
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while(testcases-- > 0){
    //        int n=Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] a2 = line.trim().split("\\s+");
            int n =Integer.parseInt(a2[0]);
            int k =Integer.parseInt(a2[1]);
            //int y =Integer.parseInt(a2[2]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            long a[]=new long[n];
            for(int i=0;i<n;i++)
            {
                a[i]=Long.parseLong(a1[i]);
            }
            Solution ob=new Solution();
            //ArrayList<Long> ans=ob.smallestDifferenceTriplet(a,b,c,n);
            long ans=ob.subCount(a,n,k);
            System.out.println(ans);
        }
    }
}





  // } Driver Code Ends