class Solution {
    public int mySqrt(int x) {
        int i = 1, n = 0,k = 0;
        // while((long)i*i <= x)
        // {
        //     k = i*i;
        //     System.out.println(k);
        //     n = i;
        //     System.out.println(n);
        //     i++;
        // }
        // return n;
        while(i <= x/i)
        {
            n = i;
            i++;
        }
        return n;
    }
}