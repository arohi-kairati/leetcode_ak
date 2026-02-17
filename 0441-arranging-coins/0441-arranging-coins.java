class Solution {
    public int arrangeCoins(int n) {
        int i = 1, count = 0;
        if(n == 1)
        {
            return 1;
        }
        while(n > 0)
        {
            n = n - i;
            i++;
            count++;
        }
        if(n < 0)
        {
            count--;
        }
        return count;
    }
}