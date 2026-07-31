class Solution {
    public int arrangeCoins(int n) 
    {
        int count = 0;
        for(int i = 1; i<=n ; i++)
        {
            count = count + i;
            
            if(count>n)
            {
                i = i-1;
                return i;
            }
        }
        return 1;
    }
}