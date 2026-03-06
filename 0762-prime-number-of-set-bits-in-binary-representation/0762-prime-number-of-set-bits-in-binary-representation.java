class Solution {
    public int countPrimeSetBits(int left, int right) {
        int c = 0, count = 0, prime = 0;
        for(int i = left; i <= right; i++)
        {
            int k = i;
            while(k > 0)
            {
                if(k % 2 == 1)
                {
                    c++;
                }
                k /= 2;
            }
            for(int j = 1; j <= c/2; j++)
            {
                if(c % j == 0)
                {
                    count++;
                }
            }
            if(count == 1)
            {
                prime++;
            }
            count = 0;
            c = 0;
        }
        return prime;
    }
}