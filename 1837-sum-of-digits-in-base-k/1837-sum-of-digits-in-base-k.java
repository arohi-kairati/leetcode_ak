class Solution {
    public int sumBase(int n, int k) {
        int num = n, newn = 0;
        while(num > 0)
        {
            int rem = num%k;
            newn = newn*10 + rem;
            num /= k;
        }

        int sum = 0;
        while(newn > 0)
        {
            int rem = newn % 10;
            sum += rem;
            newn /= 10;
        }
        return sum;
    }
}