class Solution {
    public int subtractProductAndSum(int n) {
        int rem = 0, sum = 0, prod = 1;
        while(n>0)
        {
            rem = n%10;
            prod *= rem;
            sum += rem;
            n = n/10;
        }
        return prod - sum;
    }
}