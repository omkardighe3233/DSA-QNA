class Solution {
    public int lengthOfLastWord(String s) 
    {
       s = s.trim();

    if(s.length()==0 || s.length()==1 ) return s.length();
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