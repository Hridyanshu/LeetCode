class Solution
{
    public int nthUglyNumber(int n)
    {
        ArrayList<Integer> ugly = new ArrayList<Integer>();
		//first ugly no is 1.
        ugly.add(1);
        //these variables will act as counters for minimum value
		int a=0, b=0, c=0;
        int temp = n;
        int tempElement;
		while(temp>0)
        {
			tempElement = Math.min(ugly.get(a)*2,Math.min(ugly.get(b)*3,ugly.get(c)*5));
            ugly.add(tempElement);
			if(tempElement == ugly.get(a)*2)
				a++;
			if(tempElement == ugly.get(b)*3)
				b++;
			if(tempElement == ugly.get(c)*5)
				c++;
            temp--;
		}
		return ugly.get(n-1);
    }
}
