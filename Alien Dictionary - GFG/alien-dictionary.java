// { Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.math.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = Integer.parseInt(sc.next());
		while(t-- > 0)
		{
		    int n = Integer.parseInt(sc.next());
		    int k = Integer.parseInt(sc.next());
		    
		    String[] words = new String[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        words[i] = sc.next();
		    }
		    
		    Solution ob = new Solution();
		  //  System.out.println(T.findOrder(words,k));
		    String order = ob.findOrder(words,n,k);
		    if(order.length() == 0){
		        System.out.println(0);
		        continue;
		    }
		    String temp[] = new String[n];
		    for(int i=0;i<n;i++)
		        temp[i] = words[i];
		    
		    Arrays.sort(temp, new Comparator<String>(){
		    
		      @Override
                public int compare(String a, String b) {
                    int index1 = 0;
                    int index2 = 0;
                    for(int i = 0; i < Math.min(a.length(), b.length()) 
                                        && index1 == index2; i++) {
                        index1 = order.indexOf(a.charAt(i));
                        index2 = order.indexOf(b.charAt(i));
                    }
                
                    if(index1 == index2 && a.length() != b.length()) 
                    {
                        if(a.length() < b.length())
                            return -1;
                        else
                            return 1;
                    }
                
                    if(index1 < index2)
                        return -1;
                    else
                        return 1;
                        
                }
		    });
		    
		    int flag = 1;
		    for(int i=0;i<n;i++)
		    {
		        if(!words[i].equals(temp[i]))
	            {
	                flag = 0;
	                break;
	            }
		    }
		    
		    System.out.println(flag);
		}
	}
	
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String findOrder(String [] dict, int N, int K)
    {
        // Write your code here
       ArrayList<Integer>[] graph = (ArrayList<Integer>[])new ArrayList[K];
        for(int i =0;i<K;i++){
            graph[i] = new ArrayList<>();
        }
        for(int j =0;j<dict.length-1;j++){
            String w1 = dict[j];
            String w2 = dict[j+1];
            for(int i=0;i<Math.min(w1.length(),w2.length()) ;i++){
               int ch1 = w1.charAt(i)-'a'; 
               int ch2 = w2.charAt(i)-'a';
               if(ch1!=ch2){
                   graph[ch1].add(ch2);
                   break;
               }
                
            }
        }
        // topological sort
        boolean []vis = new boolean[K];
        Stack<Integer>st = new Stack<>();
        for(int v= 0;v<K;v++){
            if(vis[v]==false){
                tsort(graph , v , st ,vis);
            }
        }
        String ans = "";
        while(st.size()>0){
            char ch = (char)(st.pop()+'a');
            ans = ans+ch;
        }
        return ans;
        
    }
    public void tsort(ArrayList<Integer>[]graph , int v,Stack<Integer>st ,boolean[]vis){
        vis[v]=true;
        for(int n:graph[v]){
            if(vis[n]==false){
                tsort(graph,n ,st ,vis );
            }
        }
        st.push(v);
    }
}