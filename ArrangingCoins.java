class Solution {
    public int arrangeCoins(int n) {
        int i=1;
        int rowCount=0;
        while(n>0)
        {
            n = n-i;
            i++;
            rowCount++;
        }
        if(n<0)
            return rowCount-1;
        return rowCount;
    }
}
