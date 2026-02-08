class Solution {
    public int[] countBits(int n) {
        int []arr = new int[n+1];
        int count_one = 0;
        for(int i = 0; i <= n; i++)
        {
            if(i == 0)
            {
                arr[i] = 0;
                continue;
            }

            int k = i;
            while(k > 0)
            {
                if(k % 2 == 1)
                {
                    count_one++;
                }
                k /= 2;
            }
            arr[i] = count_one;
            count_one = 0;
        }
        return arr;
    }
}