class Solution {
    public int lengthOfLastWord(String s) 
    {
       
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