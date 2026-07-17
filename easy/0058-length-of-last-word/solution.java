class Solution {
    public int lengthOfLastWord(String s) 
    {
    if(s.length()==0 || s.length()==1 ) return s.length();
       s = s.trim();

       int i = s.length()-1;
       int count = 0;
       char ch = ' ';
      while(s.charAt(i) != ch)
      {
            i--;
            count++;
      }
      return count;
    }
}