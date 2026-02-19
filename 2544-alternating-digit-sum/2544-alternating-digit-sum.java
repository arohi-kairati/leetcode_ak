class Solution {
    public int alternateDigitSum(int n) {
        int k = n;
        int l = 0;
        while(k > 0)
        {
            l++;
            k /= 10;
        }
        int j = 1;
        int i = 2;
        int sum = 0;
        int r = 0;
        while(n > 0)
        {
            if(l % 2 == 0)
            {
                r = n%10 * (int)Math.pow(-1, j);
                sum += r;
                j++;
            }
            else
            {
                r = n%10 * (int)Math.pow(-1, i);
                sum += r;
                i++;
            }
            n /= 10;
        }
        return sum;
    }
}