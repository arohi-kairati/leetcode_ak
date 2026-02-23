class Solution {
    public int mirrorDistance(int n) {
        int k = n, rev_n = 0;
        while(k > 0)
        {
            int rem = k % 10;
            rev_n = rev_n * 10 + rem;
            k /= 10;
        }
        return Math.abs(rev_n - n);
    }
}