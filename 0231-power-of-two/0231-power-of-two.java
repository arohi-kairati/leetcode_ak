class Solution {
    public boolean isPowerOfTwo(int n) {
        while(n > 0 && n % 2 == 0)
        {
            n /= 2;
        }
        return n == 1;
        // if (n > 0 && (n & (n - 1)) == 0) 
        // {
        //     return true;
        // }
        // return false;
    }
}