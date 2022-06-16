 class Solution {
    public String longestPalindrome(String s) {
        int start=0,end=0;
        for(int i=0;i<s.length()-1;i++)
        {
            int len1=getMaxLength(s,i,i); // for odd palindrome
            int len2=getMaxLength(s,i,i+1); // for even palindorme
            int len=Math.max(len1,len2);
            if(len>(end-start))
            {
                start=i-(len-1)/2;
                end=i+(len)/2;
            }
        }
        return s.substring(start,end+1);
    }
    public int getMaxLength(String s,int left,int right)
    {
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right))
        {
            left--;
            right++;
        }
        return right-left-1;
    }
}