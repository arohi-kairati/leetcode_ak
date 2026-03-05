class Solution {
    public int numberOfCuts(int n) {
        int k = n;
        if(n == 1)
        {
            return 0;
        }
        while(n != 0 && n != 1)
        {
            //rem = n % 2;
            n %= 2;
        }
        System.out.println(n);
        if(n == 1)
        {
            return k;
        }
        return k/2;
    }
}