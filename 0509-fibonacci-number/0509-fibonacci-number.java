class Solution {
    public int fib(int n) {
        int first = 0, sec = 1, next = 0;
        if(n == 0)
        {
            return first;
        }
        else if(n == 1)
        {
            return sec;
        }
        else
        {
            for(int i = 2; i <= n; i++)
            {
                next = first + sec;
                first = sec;
                sec = next;
            }
            return next;
        }
    }
}