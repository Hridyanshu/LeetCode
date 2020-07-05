class Solution {
    public int hammingDistance(int x, int y) {
        //counter for the positions where coress bits are different.
        int count = 0;
        //digit1 and digit2 stores the corres bits of x and y resp
        int digit1, digit2;
        while(x>0 || y>0)
        {
            //This loop converts the decimal no into binary and stores the corres bits
            digit1 = (x>0) ? (x%2) : 0;
            digit2 = (y>0) ? (y%2) : 0;
            if(digit1 != digit2)
                count++;
            x = x/2;
            y = y/2;
        }
        return count;
    }
}
