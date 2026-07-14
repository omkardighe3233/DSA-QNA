class Solution {
    public int maxArea(int[] height) 
    {
       int lp = 0;
       int rp = height.length-1;
       int currwater=0;
        while(lp<rp)
        {
            int hig = Math.min(height[lp],height[rp]);
            int wid = rp-lp;
            currwater = Math.max( wid*hig , currwater );
            if(height[lp] < height[rp])
            {
                lp++;
            }
            else{
                rp--;
            }
        }
       return currwater; 
    }
}
