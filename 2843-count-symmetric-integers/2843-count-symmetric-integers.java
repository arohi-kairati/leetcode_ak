class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for(int j = low; j <= high; j++)
        {
            int k = j, num = j, l = 0;
            while(k > 0)
            {
                l++;
                k /= 10;
            }
            if(l % 2 == 0)
            {
                int i = 1, sum1 = 0, sum2 = 0;
                while(i <= l/2)
                {
                    sum1 += num % 10;
                    num /= 10;
                    i++;
                }
                while(i <= l)
                {
                    sum2 += num % 10;
                    num /= 10;
                    i++;
                }
                if(sum1 == sum2)
                {
                    count++;
                }
            }
        }
        return count;
    }
}