class Solution {
    public boolean isPalindrome(int x) 
    {
        if(x < 0) return false;
        if(x==0) return true;
        if(x%10 == 0) return false;
        int rever = 0;
        int y = x;
        while(x!= 0 )
        {
           rever = (rever*10) + x % 10;
           x = x / 10;
        }
        if(rever == y ) 
        {
            return true;
        }
        return false;    
    }
}
