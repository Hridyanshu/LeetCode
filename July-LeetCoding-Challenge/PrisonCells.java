class Solution {
    public int[] prisonAfterNDays(int[] cells, int N) {
        //if we observe, then the pattern is getting the same at every 15th day
        //thus, pattern at 15th day is same as that of day 1.
        N = N%14;
        int count;
        if(N==0)
            count = 14;
        else
            count = N;
        int temp[] = cells.clone();
        temp[0] = 0;
        temp[7] = 0;
        while(count>0)
        {
            for(int i=1;i<7;i++)
            {
                if((cells[i-1] == 1 && cells[i+1] == 1) || (cells[i-1] == 0 && cells[i+1] == 0))
                    temp[i] = 1;
                else
                    temp[i] = 0;
            }
            cells = temp.clone();
            count--;
        }
        return cells;
    }
}
