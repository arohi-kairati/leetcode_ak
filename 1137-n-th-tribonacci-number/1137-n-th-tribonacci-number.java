class Solution {
    public int tribonacci(int n) {
        int z = 0, f = 1, s = 1;
        int next = 0;
        if(n == 0)
        {
            return z;
        }
        if(n == 1)
        {
            return f;
        }
        if(n == 2)
        {
            return s;
        }
        for(int i = 3; i <= n; i++)
        {
            next = z + f + s;
            z = f;
            f = s;
            s = next;
        }
        return next;
    }
}