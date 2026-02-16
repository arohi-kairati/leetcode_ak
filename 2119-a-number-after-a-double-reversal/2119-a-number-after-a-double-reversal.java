class Solution {
    public boolean isSameAfterReversals(int num) {
        int n = num;
        int rev = 0, rev2 = 0;
        while(n > 0)
        {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }
        while(rev > 0)
        {
            int rem = rev % 10;
            rev2 = rev2*10 + rem;
            rev /= 10;
        }
        return rev2 == num;
    }
}